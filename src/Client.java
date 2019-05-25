import java.util.Vector;


public class Client {
    private String nif;
    private String nom;
    private String telefon;
    private Vector<Lloguer> lloguers;

    Client(){}

    public Client(String nif, String nom, String telefon) {
        this.nif = nif;
        this.nom = nom;
        this.telefon = telefon;
        this.lloguers = new Vector<Lloguer>(10,10);
    }

    public String getNif()     { return nif;}
    public String getNom()     { return nom;}
    public String getTelefon() { return telefon;}
    public int getClientes(){return lloguers.size();}

    public void setNif(String nif) { this.nif = nif; }
    public void setNom(String nom) { this.nom = nom; }
    public void setTelefon(String telefon) { this.telefon = telefon; }

    public void afegeix(Lloguer lloguer) {
        if (!lloguers.contains(lloguer)) {
            lloguers.add(lloguer);
        }
    }
    public void elimina(Lloguer lloguer) {
        if (lloguers.contains(lloguer)) {
            lloguers.remove(lloguer);
        }
    }
    public boolean conte(Lloguer lloguer) {
        return lloguers.contains(lloguer);
    }

    public Vector<Lloguer> getLloguers() {
        return lloguers;
    }

    public String informe() {
        double total = 0;
        int bonificacions = 0;
        String resultat = "Informe de lloguers del client " +
                getNom() +
                " (" + getNif() + ")\n";
        for (Lloguer lloguer: lloguers) {
            bonificacions += bonificacionsDeLloguer(lloguer);
            // composa els resultats d'aquest lloguer
            resultat += "\t" +
                    lloguer.getVehicle().getMarca() +
                    " " +
                    lloguer.getVehicle().getModel() + ": " +
                    (lloguer.quantitat() * 30) + "€" + "\n";
            total += lloguer.quantitat() * 30;
        }

        // afegeix informació final
        resultat += "Import a pagar: " + total + "€\n" +
                "Punts guanyats: " + bonificacions + "\n";
        return resultat;
    }

    public int bonificacionsDeLloguer(Lloguer lloguer){
        double quantitat = lloguer.quantitat();

        // afegeix bonificació per dos dies de lloguer de Luxe
        if (lloguer.getVehicle().getCategoria() == Vehicle.LUXE && lloguer.getDies()>1 ) {
            return 2;
        }
        return 1;
    }

    @Override
    public String toString() {
        return "el amigo "+ nom + " amb el dni " + nif + " i amb telèfon " + telefon + lloguers.toString();
    }
}