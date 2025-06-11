package drones;

import java.time.LocalDate;

public abstract class Dron {
    String modelo;
    LocalDate fechaAdq;
    String nivelCarga;
    int contador_id;
    Estado estado;
    int bateria;

    public Dron(String modelo, LocalDate fechaAdq, String nivelCarga, int contador_id, Estado estado, int bateria) {
        this.modelo = modelo;
        this.bateria = bateria;
        this.contador_id = contador_id;
        this.estado = estado;
        this.fechaAdq = fechaAdq;
        this.nivelCarga = nivelCarga;
    }

    public Dron(){
        this.modelo="Autel";
        this.bateria=100;
        this.estado=Estado.VUELO;
        this.fechaAdq=LocalDate.of(2023,5,7);
        this.nivelCarga="5kg";
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getFechaAdq() {
        return fechaAdq;
    }

    public void setFechaAdq(LocalDate fechaAdq) {
        this.fechaAdq = fechaAdq;
    }

    public String getNivelCarga() {
        return nivelCarga;
    }

    public void setNivelCarga(String nivelCarga) {
        this.nivelCarga = nivelCarga;
    }

    public int getContador_id() {
        return contador_id;
    }

    public void setContador_id(int contador_id) {
        this.contador_id = contador_id;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public void recargar(){
        if(this.bateria<20){
            this.bateria=100;
        }
        else{
            this.bateria+=10;
        }
    }
}
