package drones;

import java.time.LocalDate;

public class Carga extends Dron{
    private int pesoCarga;
    private int distancia;
    private boolean exito;

    public Carga(int pesoCarga, int distancia, String modelo, LocalDate fechaAdq, String nivelCarga, int contador_id, Estado estado, int bateria, double longO, double latO, double longD, double latD, boolean exito){
        super(modelo, fechaAdq, nivelCarga, contador_id, estado, bateria, longO, latO, longD, latD);
            this.pesoCarga=pesoCarga;
            this.distancia=distancia;
            this.exito=exito;
    }

    public int getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(int pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public boolean isExito() {
        return exito;
    }

    public void setExito(boolean exito) {
        this.exito = exito;
    }
    @Override
    public boolean capacidad(){
        if(this.distancia<=30 && this.getBateria()>=48){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean misionExitosa() {
        if(capacidad()){
            return true;
        }
        else{
            return false;
        }
    }


}
