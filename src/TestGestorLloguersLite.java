import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestGestorLloguersLite {
    @Test
    public void testInforme0(){
        Client isvy = new Client("Y1846344X", "Isvy Kelison", "665239406");
        String informe = isvy.informe();
        String resultat = "Informe de lloguers del client Isvy Kelison (Y1846344X)\n" +
                "Import a pagar: 0.0€\n" +
                "Punts guanyats: 0\n";
        Assert.assertEquals(resultat, informe);
    }

    @Test
    public void testInforme1BASIC() throws ParseException {
        Vehicle vehicleBasic = new Vehicle("Corsa", "Opel", Vehicle.BASIC);
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Lloguer lloguerBasic = new Lloguer(date, 2, vehicleBasic);
        Client isvy = new Client("Y1846344X", "Isvy Kelison", "665239406");
        isvy.afegeix(lloguerBasic);
        String informe = isvy.informe();
        String resultat = "Informe de lloguers del client Isvy Kelison (Y1846344X)\n" +
                "\tOpel Corsa: 90.0€\n" +
                "Import a pagar: 90.0€\n" +
                "Punts guanyats: 1\n";
        Assert.assertEquals(resultat, informe);
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
        String informe = isvy.informe();
        String resultat = "Informe de lloguers del client Isvy Kelison (Y1846344X)\n" +
                "\tOpel Corsa: 90.0€\n" +
                "\tIbiza Seat: 90.0€\n" +
                "Import a pagar: 180.0€\n" +
                "Punts guanyats: 2\n";
        Assert.assertEquals(resultat, informe);
    }
    @Test
    public void testInforme1GENERAL() throws ParseException {
        Vehicle vehicleGeneral = new Vehicle("CL6", "Mercedez", Vehicle.GENERAL);
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Lloguer lloguerGeneral = new Lloguer(date, 2, vehicleGeneral);
        Client isvy = new Client("Y1846344X", "Isvy Kelison", "665239406");
        isvy.afegeix(lloguerGeneral);
        String informe = isvy.informe();
        String resultat = "Informe de lloguers del client Isvy Kelison (Y1846344X)\n" +
                "\tMercedez CL6: 120.0€\n" +
                "Import a pagar: 120.0€\n" +
                "Punts guanyats: 1\n";
        Assert.assertEquals(resultat, informe);
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
        String informe = isvy.informe();
        String resultat = "Informe de lloguers del client Isvy Kelison (Y1846344X)\n" +
                "\tMercedez CL6: 120.0€\n" +
                "\tMercedez CL6: 120.0€\n" +
                "Import a pagar: 240.0€\n" +
                "Punts guanyats: 2\n";
        Assert.assertEquals(resultat, informe);
    }
    @Test
    public void testInforme1LUXE() throws ParseException {
        Vehicle vehicleLuxe = new Vehicle("Enzo", "Ferrari", Vehicle.LUXE);
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Lloguer lloguerLuxer = new Lloguer(date, 2, vehicleLuxe);
        Client isvy = new Client("Y1846344X", "Isvy Kelison", "665239406");
        isvy.afegeix(lloguerLuxer);
        String informe = isvy.informe();
        String resultat = "Informe de lloguers del client Isvy Kelison (Y1846344X)\n" +
                "\tFerrari Enzo: 360.0€\n" +
                "Import a pagar: 360.0€\n" +
                "Punts guanyats: 2\n";
        Assert.assertEquals(resultat, informe);
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
        String informe = isvy.informe();
        String resultat = "Informe de lloguers del client Isvy Kelison (Y1846344X)\n" +
                "\tFerrari Enzo: 360.0€\n" +
                "\tFerrari Enzo: 360.0€\n" +
                "Import a pagar: 720.0€\n" +
                "Punts guanyats: 4\n";
        Assert.assertEquals(resultat, informe);
    }

    @Test
    public void testInforme1diaLUXE() throws ParseException {
        Vehicle vehicleLuxe = new Vehicle("Enzo", "Ferrari", Vehicle.LUXE);
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Lloguer lloguerLuxer = new Lloguer(date, 1, vehicleLuxe);
        Client isvy = new Client("Y1846344X", "Isvy Kelison", "665239406");
        isvy.afegeix(lloguerLuxer);
        String informe = isvy.informe();
        String resultat = "Informe de lloguers del client Isvy Kelison (Y1846344X)\n" +
                "\tFerrari Enzo: 180.0€\n" +
                "Import a pagar: 180.0€\n" +
                "Punts guanyats: 1\n";
        Assert.assertEquals(resultat, informe);
    }

    @Test
    public void testInforme2LUXEHTML() throws ParseException {
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
        String informe = isvy.informeHTML();
        String resultat = "<h1>Informe de lloguers</h1>\n" +
                "<p>Informe de lloguers del client <em>Ken Robinson </em> (<strong>43092837A</strong>)</p>\n" +
                "<table>\n" +
                "<tr><td><strong>Marca</strong></td><td><strong>Model</strong></td><td><strong>Import</strong></td></tr>     <tr><td>Tata</td><td>Vista</td><td>90.0€</td></tr>\n" +
                "    <tr><td>Wolswagen</td><td>Passat</td><td>270.0€</td></tr>\n" +
                "    <tr><td>Mercedes</td><td>SLK 2.0</td><td>360.0€</td></tr>\n" +
                "</table>\n" +
                "<p>Import a pagar: <em>720.0€</em></p>\n" +
                "<p>Punts guanyats: <em>4</em></p>";
        Assert.assertEquals(resultat, informe);
    }
}
