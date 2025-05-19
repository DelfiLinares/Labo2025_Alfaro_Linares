package vehiculos;

public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private double velocidad;


    public Coche (){
        this.marca="Ford";
        this.modelo="Focus";
        this.color="Azul";
        this.velocidad=0;
    }

    public Coche(String marca, String modelo, String color, double velocidad){
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
    public String getColor(){
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
    public void setColor(String color){
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
        System.out.println("Velocidad: " + cochecito.velocidad);
    }
    public static void main (String [] args) {
        Coche cochecito = new Coche("Chevrolet", "Onix", "Blanco", 0);
        System.out.println("Velocidad A: " + cochecito.Acelerar());
        System.out.println("Velocidad F: " + cochecito.Frenar());
        cochecito.Mostrar(cochecito);
    }
}
