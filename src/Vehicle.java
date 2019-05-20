import java.util.Locale;

public class Vehicle {
    public static Locale.Category BASIC;
    public static Locale.Category PREMIUN;
    public static Locale.Category BUSINESS;
    private String model;
    private String marca;
    private Locale.Category categoria;

    Vehicle(Vehicle vehicle){}

    Vehicle(String model, String marca, Locale.Category categoria){
        this.model = model;
        this.marca = marca;
        this.categoria = categoria;
    }

    public void setModel(String model) {this.model = model;}
    public void setMarca(String marca) {this.marca = marca;}
    public void setCategoria(Locale.Category categoria) {this.categoria = categoria;}

    public String getModel() {return model;}
    public String getMarca() {return marca;}
    public Locale.Category getCategoria() {return categoria;}

    @Override
    public String toString() {
        return " to String Vehicle: " + model + " " + marca + " " + categoria;
    }
}
