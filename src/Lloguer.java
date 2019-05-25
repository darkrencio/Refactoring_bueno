import java.util.Date;

public class Lloguer {
    //private Lloguer lloguer;
    private Date data;
    private Integer dies;
    private Vehicle id;

    Lloguer(){}

    Lloguer(Date data, Integer dies, Vehicle vehicle){
        this.data = data;
        this.dies = dies;
        this.id = vehicle;
    }

    public void setData(Date data) {this.data = data;}
    public void setDies(Integer dies) {this.dies = dies;}

    public Date getData() {return data;}
    public Integer getDies() {return dies;}

    @Override
    public String toString() {
        return " to String de Lloguer: " + data + " " + dies + id.toString();
    }

    public Vehicle getVehicle() {
        return id;
    }

    public double quantitat(){
        double quantitat = 0;
        switch (getVehicle().getCategoria()) {
            case Vehicle.BASIC:
                quantitat += 3;
                if (getDies() > 3) {
                    quantitat += (getDies() - 3) * 1.5;
                }
                break;
            case Vehicle.GENERAL:
                quantitat += 4;
                if (getDies() > 2) {
                    quantitat += (getDies() - 2) * 2.5;
                }
                break;
            case Vehicle.LUXE:
                quantitat += getDies() * 6;
                break;
        }
        return quantitat;
    }

    public int bonificacions(){
        double quantitat = quantitat();

        // afegeix bonificació per dos dies de lloguer de Luxe
        if (getVehicle().getCategoria() == Vehicle.LUXE && getDies()>1 ) {
            return 2;
        } else {
            return 1;
        }
    }

}
