
package edificio;
public class SensorTemperatura extends DispositivoSeguridad{

    public SensorTemperatura(String estado, int medida, int umbralI, int anio) {
        super(estado, medida, umbralI, anio);
    }

    public SensorTemperatura() {
        super();
    }

    @Override
    public void alarma(){
        if (getMedida() > getUmbralI()) {
            System.out.println("Se activó una alarma");
            System.out.println("SENSOR DE TEMPERATURA -Cuidado la temperatura sube!");
            System.out.println("-----------------------------");
        }
        else {
            System.out.println("El sensor de temperatura no detectó disperfectos");
            System.out.println("-----------------------------");

        }
    }
}
