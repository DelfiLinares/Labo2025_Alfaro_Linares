package figuras;

public abstract class FiguraGeometrica {
    private double base;
    private double altura;
    private double radio;

    public FiguraGeometrica(double base, double altura){
        this.base=base;
        this.altura=altura;
    }
    public FiguraGeometrica(double radio){
        this.radio=radio;
    }
    public FiguraGeometrica(){
        this.base=2.5;
        this.altura=3;
        this.radio=5;
    }

    public abstract double Area (double radio);

    public abstract double Perimetro (double radio);

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
