package figuras;

import figuras.FiguraGeometrica;

public class Circulo extends FiguraGeometrica {

    public Circulo (double r){
        super(r);
    }
    public Circulo (double b, double a){
        super(5,6);
    }


    public double Area (double radio){
        double resultado;
        resultado= Math.PI * Math.pow(radio, 2);
        return resultado;
    }
    public double Perimetro (double radio){
        double resultado;
        resultado= 2 * Math.PI * radio;
        return resultado;
    }

    public static void main (String [] args){
        Circulo circulito= new Circulo(8);
        System.out.println("Área: "+circulito.Area(circulito.getRadio()));
        System.out.println("Perímetro: "+ circulito.Perimetro(circulito.getRadio()));
    }
}

