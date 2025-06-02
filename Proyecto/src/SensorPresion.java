
package edificio;
public class SensorPresion extends DispositivoSeguridad {
    boolean activado;

    public SensorPresion(String estado, int medida, int umbralI, int anio, boolean activado) {
        super(estado, medida,  umbralI, anio);
        this.activado=activado;
    }
    public SensorPresion() {
        super();
        this.activado=false;

    }
    @Override
    public void alarma(){
        if (getMedida() > getUmbralI()) {
            System.out.println("Se activó una alarma");
            this.activado = true;
            System.out.println("SENSOR DE PRESION - Activado");
            System.out.println("-----------------------------");
        }
        else {
            System.out.println("El sensor de presión no detectó disperfectos");
            System.out.println("-----------------------------");

        }
    }
}
