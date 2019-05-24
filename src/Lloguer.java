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
}
