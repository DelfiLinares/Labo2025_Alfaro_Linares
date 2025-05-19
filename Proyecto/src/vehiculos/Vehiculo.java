package vehiculos;

import java.time.LocalDate;

public class Vehiculo {
    String marca;
    String modelo;
    String color;
    int cantRuedas;
    LocalDate anioF;

    public Vehiculo(String marca, String modelo, String color, int cant, LocalDate f){
        this.modelo=modelo;
        this.marca=marca;
        this.color=color;
        this.cantRuedas=cant;
        this.anioF=f;
    }

    public Vehiculo(){
        this.modelo="500";
        this.marca="Fiat";
        this.color="Negro";
        this.cantRuedas=4;
        this.anioF=LocalDate.of(4,6,2002);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public LocalDate getAnioF() {
        return anioF;
    }

    public void setAnioF(LocalDate anioF) {
        this.anioF = anioF;
    }

}


