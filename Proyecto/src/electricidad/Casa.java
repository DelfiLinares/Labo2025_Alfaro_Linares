package electricidad;

public class Casa extends Vivienda{
    private float cubiertos;
    private float descubiertos;

    public Casa(float cubiertos, float descubiertos, String dire, int codPostal, Duenio duenio){
        super(dire,codPostal,duenio);
        this.cubiertos=cubiertos;
        this.descubiertos=descubiertos;
    }

    public float getCubiertos() {
        return cubiertos;
    }

    public void setCubiertos(float cubiertos) {
        this.cubiertos = cubiertos;
    }

    public float getDescubiertos() {
        return descubiertos;
    }

    public void setDescubiertos(float descubiertos) {
        this.descubiertos = descubiertos;
    }

    @Override
   public double cantPorPagar() {
        double porPagar=0.0;
        /*for(double aux: this.getControl().values()){
            porPagar+=(aux*100);
        }
        */return porPagar;

    }
}
