
package edificio;
public class DetectorHumo extends DispositivoSeguridad {
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


    @Override
    public void alarma(){
        if (getMedida() > getUmbralI()) {
            System.out.println("DETECTOR DE HUMO - Llamada a bomberos... TEL " + this.getNumBomberos());
            System.out.println("-----------------------------");
        }
        else {
            System.out.println("El detector de humo no detectó disperfectos");
            System.out.println("-----------------------------");

        }
    }

}
