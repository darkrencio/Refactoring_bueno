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
        String resultat = "Informe de lloguers del client " +
                getNom() +
                " (" + getNif() + ")\n";
        for (Lloguer lloguer: lloguers) {
            // composa els resultats d'aquest lloguer
            resultat += "\t" +
                    lloguer.getVehicle().getMarca() +
                    " " +
                    lloguer.getVehicle().getModel() + ": " +
                    (lloguer.quantitat() * 30) + "€" + "\n";
        }

        // afegeix informació final
        resultat += "Import a pagar: " + importTotal() + "€\n" +
                "Punts guanyats: " + bonificacionsTotals() + "\n";
        return resultat;
    }

    public double importTotal(){
        double total = 0;
        for (Lloguer lloguer: lloguers) {
            total += lloguer.quantitat() * 30;
        }
        return total;
    }


    public int bonificacionsTotals(){
        int bonificaciones = 0;
        for (Lloguer lloguer: lloguers) {
            bonificaciones += lloguer.bonificacions();
        }
        return bonificaciones;
    }

    @Override
    public String toString() {
        return "el amigo "+ nom + " amb el dni " + nif + " i amb telèfon " + telefon + lloguers.toString();
    }
}