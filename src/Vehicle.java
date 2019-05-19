public class Vehicle {
    private String model;
    private String marca;
    private String categoria;

    Vehicle(){}

    Vehicle(String model, String marca, String categoria){
        this.model = model;
        this.marca = marca;
        this.categoria = categoria;
    }

    public void setModel(String model) {this.model = model;}
    public void setMarca(String marca) {this.marca = marca;}
    public void setCategoria(String categoria) {this.categoria = categoria;}

    public String getModel() {return model;}
    public String getMarca() {return marca;}
    public String getCategoria() {return categoria;}

    @Override
    public String toString() {
        return " to String Vehicle: " + model + " " + marca + " " + categoria;
    }
}
