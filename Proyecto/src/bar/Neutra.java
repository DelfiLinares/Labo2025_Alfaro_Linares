package bar;

import barJuego.Beneficio;
import barJuego.beneficioAcumulable;
import receta.Plato;

import java.util.HashSet;
import java.util.Scanner;

public class Neutra extends Bebida{
    public Neutra(String n){
        super(n);
    }

    @Override
    public void establecerPositividad() {
        Scanner s=new Scanner(System.in);
        System.out.println("Establecer coeficiente de positividad de la bebida "+this.getNombre());
        int numero=s.nextInt();
        this.setcPositividad(numero);
    }

    @Override
    public void establecerNegatividad() {
        Scanner s=new Scanner(System.in);
        System.out.println("Establecer coeficiente de negatividad de la bebida "+this.getNombre());
        int numero=s.nextInt();
        this.setcNegatividad(numero);
    }

    @Override
    public String tipo() {
        return "Neutra";
    }

}
