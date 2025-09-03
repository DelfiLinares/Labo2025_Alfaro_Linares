package edificio;
import java.util.ArrayList;
import java.util.HashSet;

public class SistemaEdificios {
    private ArrayList<DispositivoSeguridad>dispositivos;

    public SistemaEdificios(ArrayList<DispositivoSeguridad>disps){
        this.dispositivos=disps;
    }

    public void saberInfo(int numero){
        System.out.println("............");
        this.dispositivos.get(numero).alarma();
    }

    public static void main (String[] args) {
        ArrayList<DispositivoSeguridad>dispositivos=new ArrayList<>();
        SensorTemperatura sensorTemperatura = new SensorTemperatura("Conectado",84, 35,2019);
        SensorPresion sensorPresion = new SensorPresion("Desconectado", 70, 80, 2016, false);
        DetectorHumo detectorHumo=new DetectorHumo("Conectado", 0, 1, 2018,100);

        SistemaEdificios s1=new SistemaEdificios(dispositivos);

        dispositivos.add(sensorPresion);
        dispositivos.add(sensorTemperatura);
        dispositivos.add(detectorHumo);

        DispConjunto disp= new DispConjunto("Conectado", 80, 2025,dispositivos);


        Edificio edi= new Edificio("Piriririri 1830", 2015, detectorHumo, sensorPresion, sensorTemperatura, disp);
        edi.controlGeneral();// metodo antiguo, control general del edificio

        try{
            int numero=6;
            s1.saberInfo(numero);
        }
        catch(IndexOutOfBoundsException exc1){
            System.err.println("No existe esa posición dentro del ArrayList");
        }
    }
}//imputmismatchexc

