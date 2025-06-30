package mascotas;

import general.Persona;
import receta.Plato;

import java.util.ArrayList;

public abstract class Mascota {
    private String nombre;
    private Duenio duenio;
    private Animal tipo;


    public Mascota(String nombre, Duenio duenio, Animal tipo){
        this.nombre=nombre;
        this.duenio=duenio;
        this.tipo=tipo;

    }


    public  Mascota(){
        this.nombre="Nube";
        this.duenio= new Duenio("Delfi","Linares");
        this.tipo=Animal.PERRO;

        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public Animal getTipo() {
        return tipo;
    }

    public void setTipo(Animal tipo) {
        this.tipo = tipo;
    }

    public abstract void saludo(Duenio d);

    public abstract void alimentar();
/*
    public String clase(){
            return this.getTipo();
    }/*/
    public void saludoDuenio(Duenio d){
        saludo(d);
    }

    }

