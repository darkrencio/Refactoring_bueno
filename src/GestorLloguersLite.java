import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GestorLloguersLite {
    public static void main(String[] args) throws ParseException {
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

        Client isvy = new Client("Y1846344X", "Isvy Kelison", "665239406");
        isvy.afegeix(lloguerBasic);
        isvy.afegeix(lloguerGeneral);
        isvy.afegeix(lloguerLuxe);

        // demostració de formatat d'una data
        System.out.println(dateFormat.format(lloguerBasic.getData()));

        // Provant printLloguer
        printLloguer(isvy);

        System.out.println(isvy.informe());
    }

    public static void printLloguer(Client client) {
        System.out.println("Client: " + client.getNom() + "\n        " + client.getNif() + "\n        " + client.getTelefon());
        for (int i = 0; i < client.getClientes(); i++) {
            System.out.println("\nLloguers: " + client.getClientes() + "\n   " + (i+1) + ". vehicle:" + client.getLloguers().get(i).getVehicle() + "/" + client.getLloguers().get(i).getVehicle().getMarca() + "\n      data d'inici: " + client.getLloguers().get(i).getData() + "\n      dies llogats: " + client.getLloguers().get(i).getDies());
        }
    }

    @Test
    public void testInforme0(){
        Client isvy = new Client("Y1846344X", "Isvy Kelison", "665239406");
        System.out.println(isvy.informe());
    }

    @Test
    public void testInforme1BASIC() throws ParseException {
        Vehicle vehicleBasic = new Vehicle("Corsa", "Opel", Vehicle.BASIC);
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Lloguer lloguerBasic = new Lloguer(date, 2, vehicleBasic);
        Client isvy = new Client("Y1846344X", "Isvy Kelison", "665239406");
        isvy.afegeix(lloguerBasic);
        System.out.println(isvy.informe());
    }
    @Test
    public void testInforme2BASIC() throws ParseException {
        Vehicle vehicleBasic = new Vehicle("Corsa", "Opel", Vehicle.BASIC);
        Vehicle vehicleBasic2 = new Vehicle("Seat", "Ibiza", Vehicle.BASIC);
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Date date2 = dateFormat.parse("9/8/2013");
        Lloguer lloguerBasic = new Lloguer(date, 2, vehicleBasic);
        Lloguer lloguerBasic2 = new Lloguer(date2, 3, vehicleBasic2);
        Client isvy = new Client("Y1846344X", "Isvy Kelison", "665239406");
        isvy.afegeix(lloguerBasic);
        isvy.afegeix(lloguerBasic2);
        System.out.println(isvy.informe());
    }
    @Test
    public void testInforme1GENERAL() throws ParseException {
        Vehicle vehicleGeneral = new Vehicle("CL6", "Mercedez", Vehicle.GENERAL);
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Lloguer lloguerGeneral = new Lloguer(date, 2, vehicleGeneral);
        Client isvy = new Client("Y1846344X", "Isvy Kelison", "665239406");
        isvy.afegeix(lloguerGeneral);
        System.out.println(isvy.informe());
    }
    @Test
    public void testInforme2GENERAL() throws ParseException {
        Vehicle vehicleGeneral = new Vehicle("CL6", "Mercedez", Vehicle.GENERAL);
        Vehicle vehicleGeneral2 = new Vehicle("CL6", "Mercedez", Vehicle.GENERAL);
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Date date2 = dateFormat.parse("9/8/2013");
        Lloguer lloguerGeneral = new Lloguer(date, 2, vehicleGeneral);
        Lloguer lloguerGeneral2 = new Lloguer(date, 2, vehicleGeneral2);
        Client isvy = new Client("Y1846344X", "Isvy Kelison", "665239406");
        isvy.afegeix(lloguerGeneral);
        isvy.afegeix(lloguerGeneral2);
        System.out.println(isvy.informe());
    }
    @Test
    public void testInforme1LUXE() throws ParseException {
        Vehicle vehicleLuxe = new Vehicle("Enzo", "Ferrari", Vehicle.LUXE);
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Lloguer lloguerLuxer = new Lloguer(date, 2, vehicleLuxe);
        Client isvy = new Client("Y1846344X", "Isvy Kelison", "665239406");
        isvy.afegeix(lloguerLuxer);
        System.out.println(isvy.informe());
    }
    @Test
    public void testInforme2LUXE() throws ParseException {
        Vehicle vehicleLuxe = new Vehicle("Enzo", "Ferrari", Vehicle.LUXE);
        Vehicle vehicleLuxe2 = new Vehicle("Enzo", "Ferrari", Vehicle.LUXE);
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Date date2 = dateFormat.parse("9/8/2013");
        Lloguer lloguerLuxe = new Lloguer(date, 2, vehicleLuxe);
        Lloguer lloguerLuxe2 = new Lloguer(date, 2, vehicleLuxe2);
        Client isvy = new Client("Y1846344X", "Isvy Kelison", "665239406");
        isvy.afegeix(lloguerLuxe);
        isvy.afegeix(lloguerLuxe2);
        System.out.println(isvy.informe());
    }

    @Test
    public void testInforme1diaLUXE() throws ParseException {
        Vehicle vehicleLuxe = new Vehicle("Enzo", "Ferrari", Vehicle.LUXE);
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Lloguer lloguerLuxer = new Lloguer(date, 1, vehicleLuxe);
        Client isvy = new Client("Y1846344X", "Isvy Kelison", "665239406");
        isvy.afegeix(lloguerLuxer);
        System.out.println(isvy.informe());
    }


}
