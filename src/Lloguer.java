public class Lloguer {
    //private Lloguer lloguer;
    private String data;
    private Integer dies;
    private Vehicle id;

    Lloguer(){}

    Lloguer(String data, Integer dies){
        this.data = data;
        this.dies = dies;
        this.id = new Vehicle("supra", "toyota", "urbano");
    }

    public void setData(String data) {this.data = data;}
    public void setDies(Integer dies) {this.dies = dies;}

    public String getData() {return data;}
    public Integer getDies() {return dies;}

    @Override
    public String toString() {
        return " to String de Lloguer: " + data + " " + dies + id.toString();
    }
}
