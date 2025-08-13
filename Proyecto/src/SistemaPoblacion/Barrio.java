package SistemaPoblacion;

import java.util.HashSet;
import java.util.Scanner;

public class Barrio extends Lugar {

    public Barrio(String nombre, double latitud, double longitud, int poblacion) {
        super(nombre, latitud, longitud, poblacion);
    }

    @Override
    public int poblacion(){
        return this.getPoblacion();
    }
    @Override
    public void generarCod(){
        String cod="B";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar código");
        cod+= entrada.nextLine();
        setCodigo(cod);
    }

}