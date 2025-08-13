package SistemaPoblacion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Pais extends Lugar {
    private HashSet<Provincia> provincias;

    public Pais(String nombre, double latitud, double longitud, int poblacion) {
        super(nombre, latitud, longitud, poblacion);
        this.provincias = new HashSet<>();
    }

    public HashSet<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(HashSet<Provincia> provincias) {
        this.provincias = provincias;
    }

    @Override
    public int poblacion(){
        int pobPS = 0;
        for (Provincia Paux : this.provincias){
            pobPS += Paux.getPoblacion();
        }
        return pobPS;
    }
    public void generarCod(){
        String cod="P";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar código");
        cod+= entrada.nextLine();
        setCodigo(cod);
    }
}