package llamadasTelefonicas;

import java.time.LocalDate;
import java.time.LocalTime;

public class Llamada {
    private int numDestino;
    private LocalTime duracion;

    public Llamada(int numDestino, LocalTime duracion){
        this.numDestino=numDestino;
        this.duracion=duracion;
    }

    public Llamada(){
        this.duracion=LocalTime.of(0,30,13);
        this.numDestino=46432569;
    }

    public int getNumDestino() {
        return numDestino;
    }

    public void setNumDestino(int numDestino) {
        this.numDestino = numDestino;
    }

    public LocalTime getDuracion() {
        return duracion;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }

}
