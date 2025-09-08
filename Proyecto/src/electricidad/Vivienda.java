package electricidad;

import enums.Color;

import java.util.HashMap;
import java.util.HashSet;

public abstract class Vivienda {
    private String direccion;
    private int codPostal;
    private Duenio duenio;
    private HashSet<controlAnual>controlAnios;

    public Vivienda(String dire, int codPostal, Duenio duenio){
        this.direccion=dire;
        this.codPostal=codPostal;
        this.duenio=duenio;
        this.controlAnios=new HashSet<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public HashSet<controlAnual> getControlAnios() {
        return controlAnios;
    }

    public void setControlAnios(HashSet<controlAnual> controlAnios) {
        this.controlAnios = controlAnios;
    }

    /*public void cargarConsumo(double cantConsumo, Mes mes){

        this.controlAnios.add(new controlAnual());
    }*/
    public abstract double cantPorPagar();

}
