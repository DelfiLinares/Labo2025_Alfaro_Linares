package edificio;
import java.util.ArrayList;
public class SistemaEdificios {
    public static void main (String[] args) {
        SensorTemperatura sensorTemperatura = new SensorTemperatura("Conectado",84, 35,2019);
        SensorPresion sensorPresion = new SensorPresion("Desconectado", 70, 80, 2016, false);
        DetectorHumo detectorHumo=new DetectorHumo("Conectado", 0, 1, 2018,100);

        ArrayList<DispositivoSeguridad> dispositivos=new ArrayList<>();
        dispositivos.add(detectorHumo);
        dispositivos.add(sensorPresion);
        dispositivos.add(sensorTemperatura);
        DispConjunto disp= new DispConjunto("Conectado", 80, 2025,dispositivos);


        Edificio edi= new Edificio("Piriririri 1830", 2015, detectorHumo, sensorPresion, sensorTemperatura, disp);

        edi.control();
        System.out.println(sensorPresion.getEstado()); //para probar que funciona el control de estado del disp
    }
}
