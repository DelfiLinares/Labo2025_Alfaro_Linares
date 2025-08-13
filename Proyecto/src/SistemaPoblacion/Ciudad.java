package SistemaPoblacion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Ciudad extends Lugar {
    private HashSet<Barrio> barrios;

    public Ciudad(String nombre, double latitud, double longitud, int poblacion, HashSet<Barrio> barrios) {
        super(nombre,latitud, longitud, poblacion);
        this.barrios=new HashSet<>();
    }

    public HashSet<Barrio> getBarrios() {
        return barrios;
    }

    public void setBarrios(HashSet<Barrio> barrios) {
        this.barrios = barrios;
    }

    @Override
    public int poblacion(){
        int pobC = 0;
        for (Barrio baux : this.barrios){
            pobC += baux.getPoblacion();
        }
        return pobC;
    }
    public void generarCod(){
        String cod="c";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar código");
        cod+= entrada.nextLine();
        setCodigo(cod);
    }
}