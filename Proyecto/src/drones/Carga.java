package drones;

import java.time.LocalDate;

public class Carga {
    String pesoCarga;
    String distancia;

    public Carga(String pesoCarga, String distancia, String modelo, LocalDate fechaAdq, String nivelCarga, int contador_id, Estado estado, int bateria){
        super(modelo, fechaAdq, nivelCarga);

    }
}
