package edificio;
import java.util.ArrayList;

public class Edificio {
    String direccion;
    int anioConstruccion;
    DetectorHumo detectorH;
    SensorPresion sensorP;
    SensorTemperatura sensorT;
    DispConjunto dispC;

    public Edificio(String direccion, int anioConstruccion, DetectorHumo detectorH, SensorPresion sensorP, SensorTemperatura sensorT, DispConjunto dispC) {
        this.direccion = direccion;
        this.anioConstruccion = anioConstruccion;
        this.detectorH = detectorH;
        this.sensorP = sensorP;
        this.sensorT = sensorT;
        this.dispC=dispC;
    }

    public DispConjunto getDispC() {
        return dispC;
    }

    public void setDispC(DispConjunto dispC) {
        this.dispC = dispC;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAnioConstruccion() {
        return anioConstruccion;
    }

    public void setAnioConstruccion(int anioConstruccion) {
        this.anioConstruccion = anioConstruccion;
    }

    public DetectorHumo getDetectorH() {
        return detectorH;
    }

    public void setDetectorH(DetectorHumo detectorH) {
        this.detectorH = detectorH;
    }

    public SensorPresion getSensorP() {
        return sensorP;
    }

    public void setSensorP(SensorPresion sensorP) {
        this.sensorP = sensorP;
    }

    public SensorTemperatura getSensorT() {
        return sensorT;
    }

    public void setSensorT(SensorTemperatura sensorT) {
        this.sensorT = sensorT;
    }

    public void control(){
        System.out.println("Se inicó el control de dispositivos del edificio "+this.direccion);
        if(this.sensorP.controlEstado()&&this.sensorT.controlEstado()&&this.detectorH.controlEstado() ){
        this.sensorT.alarma();
        this.detectorH.alarma();
        this.sensorP.alarma();
        this.dispC.alarma();
    }
    }


}
