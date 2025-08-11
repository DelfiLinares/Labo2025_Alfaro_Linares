package controlAltura_Peso;

public class Registro {
    private double altura;
    public double peso;

    public Registro(double a, double p){
        this.altura=a;
        this.peso=p;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
