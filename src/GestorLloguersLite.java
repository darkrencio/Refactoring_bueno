import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GestorLloguersLite {
    public static void main(String[] args) throws ParseException{
        // demostració de construcció d'un vehicle de categoria BASIC
        Vehicle vehicleBasic = new Vehicle("Corsa", "Opel", Vehicle.BASIC);
        Vehicle vehicleGeneral = new Vehicle("CL6", "Mercedez", Vehicle.GENERAL);
        Vehicle vehicleLuxe = new Vehicle("Enzo", "Ferrari", Vehicle.LUXE);

        // demostració de construccuó d'un lloguer amb una data
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Lloguer lloguerBasic = new Lloguer(date, 2, vehicleBasic);
        Lloguer lloguerGeneral = new Lloguer(date, 3, vehicleGeneral);
        Lloguer lloguerLuxe = new Lloguer(date, 4, vehicleLuxe);

        Client isvy = new Client("Y1846344X","Isvy Kelison","665239406");
        isvy.afegeix(lloguerBasic);
        isvy.afegeix(lloguerGeneral);
        isvy.afegeix(lloguerLuxe);

        // demostració de formatat d'una data
        System.out.println(dateFormat.format(lloguerBasic.getData()));

        // Provant printLloguer
        printLloguer(isvy);

    }
    public static void printLloguer (Client client){
        System.out.println("Client: " + client.getNom() + "\n        " + client.getNif() + "\n        " + client.getTelefon());
        for (int i = 0; i < client.getClientes(); i++) {
            System.out.println("\nLloguers: " + client.getClientes() + "\n   1. vehicle:" + client.getLloguers().get(i).getVehicle() + "/" + client.getLloguers().get(i).getVehicle().getMarca() + "\n      data d'inici: " + client.getLloguers().get(i).getData() + "\n      dies llogats: " + client.getLloguers().get(i).getDies());
        }
    }
}
