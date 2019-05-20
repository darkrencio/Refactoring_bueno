import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GestorLloguersLite {
    // demostració de construcció d'un vehicle de categoria BASIC
    Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.BASIC);

    // demostració de construccuó d'un lloguer amb una data
    SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
    Date date = dateFormat.parse("2/8/2013");
    Lloguer lloguerBasic = new Lloguer(date, 2, vehicleBasic);
    public GestorLloguersLite() throws ParseException {
    }

    // demostració de formatat d'una data
    //System.out.println(dateFormat.format(lloguerBasic.getData()));

    public static String printLloguer(Client client, Lloguer lloguer, Vehicle vehicle) {
        String c = "Client: " + client.getNom() + "\n" + client.getNif() + "\n" + client.getTelefon();
        String l = "Lloguers: " + client.conte(lloguer) + "\n   1. vehicle:" + vehicle.getMarca() + "/" + vehicle.getModel() + "\n      data d'inici: " + lloguer.getData() + "\n      dies llogats: " + lloguer.getDies();
        return c + l;
    }
}
