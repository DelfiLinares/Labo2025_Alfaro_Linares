package mascotas;

import general.Persona;

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
        this.duenio= new Duenio("Delfi","Linares",17);
        this.tipo=Animal.PERRO;
        }

        public abstract void saludo();

    }

