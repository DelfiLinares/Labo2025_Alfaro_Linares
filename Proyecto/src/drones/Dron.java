package drones;

import java.time.LocalDate;

public abstract class Dron {
    private String modelo;
    private LocalDate fechaAdq;
    private String nivelCarga;
    private int contador_id;
    private Estado estado;
    private int bateria;
    private double latitudOrig=-34.573195;
    private double longitudOrig=-58.504111;
    private double latitudDes;
    private double longitudDes;

    public Dron(String modelo, LocalDate fechaAdq, String nivelCarga, int contador_id, Estado estado, int bateria, double longO, double longD, double latO, double latD) {
        this.modelo = modelo;
        this.bateria = bateria;
        this.contador_id = contador_id;
        this.estado = estado;
        this.fechaAdq = fechaAdq;
        this.nivelCarga = nivelCarga;
        this.latitudOrig=latO;
        this.longitudOrig=longO;
        this.latitudDes=latD;
        this.longitudDes=longD;
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

    public abstract boolean misionExitosa();
    public abstract boolean capacidad();

    public double Haversine(double latitudOrigen, double longitudOrigen, double latitudDestino, double longitudDestino){
        // Convertir a radianes
        double lat1Rad = Math.toRadians(latitudOrigen);
        double lon1Rad = Math.toRadians(longitudOrigen);
        double lat2Rad = Math.toRadians(latitudDestino);
        double lon2Rad = Math.toRadians(longitudDestino);

        // Fórmula de Haversine
        double dLat = lat2Rad - lat1Rad;
        double dLon = lon2Rad - lon1Rad;
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double radioTierraKm = 6371;
        return radioTierraKm * c;
    }
}
