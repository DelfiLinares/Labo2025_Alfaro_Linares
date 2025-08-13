package SistemaPoblacion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Continente extends Lugar {
    private HashSet<Pais> paises;

    public Continente(String nombre, double latitud, double longitud, int poblacion, HashSet<Pais> paises) {
        super(nombre, latitud, longitud, poblacion);
        this.paises = new HashSet<>();
    }

    public HashSet<Pais> getPaises() {
        return paises;
    }

    public void setPaises(HashSet<Pais> paises) {
        this.paises = paises;
    }

    @Override
    public int poblacion(){
        int pobCon = 0;
        for (Pais Psaux : this.paises){
            pobCon += Psaux.getPoblacion();
        }
        return pobCon;
    }
    public void generarCod(){
        String cod="CO";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar código");
        cod+= entrada.nextLine();
        setCodigo(cod);
    }
}