public class DetectorHumo extends Dispositivo{
    int numBomberos=100;

    public DetectorHumo(String estado, int medida, int umbralI, int anio, int num) {
        super(estado, medida, umbralI, anio);
        this.numBomberos=num;
    }

    public DetectorHumo() {
        super();
        this.numBomberos=100;
    }

    public int getNumBomberos() {
        return numBomberos;
    }

    public void setNumBomberos(int numbBomberos) {
        this.numBomberos = numBomberos;
    }


}
