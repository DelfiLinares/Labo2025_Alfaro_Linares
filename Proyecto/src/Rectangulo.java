public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo (){
        this.base=2;
        this.altura=1.5;
    }

    public Rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }


    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }


    public void setBase(double base){
        this.base=base;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }

    public double Area (double base, double altura){
        double resultado;
        resultado= base * altura;
        return resultado;
    }

    public double Perimetro (double base, double altura){
        double resultado;
        resultado= 2*(base + altura);
        return resultado;
    }

    public static void main (String [] args){
        Rectangulo rectanglito = new Rectangulo(8,3);
        System.out.println("Área: "+ rectanglito.Area(rectanglito.base, rectanglito.altura));
        System.out.println("Perímetro: "+ rectanglito.Perimetro(rectanglito.base,rectanglito.altura));
    }
}
