package electricidad;

public class Edificio extends Vivienda{
    private int ambientes;

    public Edificio(int ambientes, String dire, int codPostal, Duenio duenio){
        super(dire, codPostal, duenio);
        this.ambientes=ambientes;
    }

    public int getAmbientes() {
        return ambientes;
    }

    public void setAmbientes(int ambientes) {
        this.ambientes = ambientes;
    }
    @Override
    public double cantPorPagar() {
        double porPagar=0.0;
        for(controlAnual aux: this.getControlAnios()){

        }return porPagar;
    }
}
