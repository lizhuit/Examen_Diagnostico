public class Avion {
    //Atributos
    private String marca;
    private String color;


    //Constructor
    public Avion(){

    }
    public Avion(String color, String marca){

    }


    //Setters y Getters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        marca = marca;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        color = color;
    }

    public void marca() {
        System.out.println("Es de marca: X");
    }

    public void color() {
        System.out.println("Es de color: Blanco");
    }
}
