package SistemaPoblacion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Provincia extends Lugar {
    private HashSet<Ciudad> ciudades;

    public Provincia(String nombre, String codigo, double latitud, double longitud, int poblacion, HashSet<Ciudad> ciudades) {
        super(nombre, latitud, longitud, poblacion);
        this.ciudades = new HashSet<>();
    }

    public HashSet<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashSet<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    @Override
    public int poblacion(){
        int pobP = 0;
        for (Ciudad Caux : this.ciudades){
            pobP += Caux.getPoblacion();
        }
        return pobP;
    }
    public void generarCod(){
        String cod="p";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar código");
        cod+= entrada.nextLine();
        setCodigo(cod);
    }
}