public class Circulo {
    private double radio;

    public Circulo (){
        this.radio=2;
    }

    public Circulo(double radio){
        this.radio=radio;
    }

    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){
        this.radio=radio;
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
        System.out.println("Área: "+circulito.Area(circulito.radio));
        System.out.println("Perímetro: "+ circulito.Perimetro(circulito.radio));
    }
}

