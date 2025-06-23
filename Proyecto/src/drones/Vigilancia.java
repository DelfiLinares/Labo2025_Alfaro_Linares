package drones;

import java.time.LocalDate;

public class Vigilancia extends Dron {
    private int cantMemoria;

    public Vigilancia(String modelo, LocalDate fechaAdq, int nivelCarga, int contador_id, Estado estado, int bateria, int cantMemoria, double longD, double latD) {
        super(modelo, fechaAdq, nivelCarga, contador_id, estado, bateria, longD, latD);
        this.cantMemoria = cantMemoria;
    }

    public int getCantMemoria() {
        return cantMemoria;
    }

    public void setCantMemoria(int cantMemoria) {
        this.cantMemoria = cantMemoria;
    }

    public void sacarFoto(){
        System.out.println("Foto capturada");
    }
    @Override
    public boolean capacidad() {
        if(this.cantMemoria>=12) {
            sacarFoto();
            setCantMemoria(this.cantMemoria-12);
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
