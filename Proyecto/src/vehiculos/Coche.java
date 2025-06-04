package vehiculos;
import enums.Color;
public class Coche {
    private String marca;
    private String modelo;
    private Color color;
    private double velocidad;


    public Coche (){
        this.marca="Ford";
        this.modelo="Focus";
        this.color=Color.Rojo;
        this.velocidad=0;
    }

    public Coche(String marca, String modelo, Color color, double velocidad){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.velocidad=velocidad;
    }

    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public Color getColor(){
        return color;
    }
    public double getVelocidad(){
        return velocidad;
    }


    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public void setColor(Color color){
        this.color=color;
    }
    public void setVelocidad(double velocidad){
        this.velocidad=velocidad;
    }

    public double Acelerar () {
        velocidad+=100;
        return velocidad;
    }

    public double Frenar() {
        velocidad=0;
        return velocidad;
    }
    public void Mostrar(Coche cochecito){
        System.out.println("COCHE  Marca:"+cochecito.marca);
        System.out.println("Velocidad: "+cochecito.velocidad);
        System.out.println("Color: "+cochecito.color+'-'+cochecito.color.getHexa());
    }
    public static void main (String [] args) {
        Coche cochecito = new Coche("Chevrolet", "Onix", Color.Rojo, 0);
        System.out.println("Velocidad A: " + cochecito.Acelerar());
        System.out.println("Velocidad F: " + cochecito.Frenar());
        cochecito.Mostrar(cochecito);
    }
}
