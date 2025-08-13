package SistemaPoblacion;

import java.util.HashSet;

public class Mundo {
    private HashSet<String>continentes;
    private HashSet<Barrio>ciudades;

    public void poblacionCiudad(HashSet<Barrio>ciudades){
        int cantidadB = ciudades.size();
        int cantPob = 0;
        for (Barrio Baux : this.ciudades){
            cantPob+=Baux.getPoblacion();
        }
    }

    public static void main (String args[]) {
        HashSet<String>continentes = new HashSet<>();
    }
}
