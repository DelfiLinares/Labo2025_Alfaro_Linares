package SistemaPoblacion;

import java.util.HashSet;
import java.util.Scanner;

public abstract class Lugar {
    private String nombre;
    private String codigo;
    private double latitud;
    private double longitud;
    private HashSet<Lugar> lugares;
    private int poblacion;

    public Lugar(String nombre,  double latitud, double longitud, int poblacion) {
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
        this.poblacion = poblacion;
        generarCod();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public HashSet<Lugar> getLugares() {
        return lugares;
    }

    public void setLugares(HashSet<Lugar> lugares) {
        this.lugares = lugares;
    }

    public void agregar(Lugar l1, HashSet<Lugar> lugares) {
        lugares.add(l1);
    }

    public void borrar(Lugar l1, HashSet<Lugar> lugares) {
        lugares.remove(l1);
    }



    public void modificar(Lugar l1, HashSet<Lugar> lugares, Lugar l2) {
        for (Lugar aux : this.lugares) {
            if (l1.getCodigo().equals(aux.getCodigo())) {
                aux.setCodigo(l2.getCodigo());
                aux.setNombre(l2.getNombre());
                aux.setLatitud(l2.getLatitud());
                aux.setLongitud(l2.getLongitud());
            }
        }
    }
    public abstract int poblacion();
    public abstract void generarCod();

}