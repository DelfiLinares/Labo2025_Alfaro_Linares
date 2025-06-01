public class SensorPresion extends Dispositivo{
    boolean activado;
    public SensorPresion(String estado, int medida, int umbralI, int anio, boolean activado) {
        super(estado, medida,  umbralI, anio);
        this.activado=activado;
    }
    public SensorPresion() {
        super();
        this.activado=false;

    }
}
