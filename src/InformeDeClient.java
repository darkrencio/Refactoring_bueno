import java.util.Vector;

public class InformeDeClient {
    Client client;
    Vector<Lloguer> lloguers;

    public InformeDeClient(Client client) {
        this.client = client;
        this.lloguers = client.getLloguers();
    }

    public String informe() throws NullPointerException{
        String plantillaCapTXT = "Informe de lloguers del client %s (%s)%n";
        String cap = String.format(plantillaCapTXT,client.getNom(),client.getNif());
        String resultat = cap;
        for (Lloguer lloguer: lloguers) {
            // composa els resultats d'aquest lloguer
            resultat += "\t" +
                    lloguer.getVehicle().getMarca() +
                    " " +
                    lloguer.getVehicle().getModel() + ": " +
                    (lloguer.quantitat() * 30) + "€" + "\n";
        }

        // afegeix informació final
        resultat += "Import a pagar: " + client.importTotal() + "€\n" +
                "Punts guanyats: " + client.bonificacionsTotals() + "\n";
        return resultat;
    }

    public String informeHTML(){
        String html = "";
        return html;
    }

}
