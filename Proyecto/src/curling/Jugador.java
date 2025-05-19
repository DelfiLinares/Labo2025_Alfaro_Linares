package curling;
import colegio.Fecha;
import videoclub.Persona;

import java.time.LocalDate;

public class Jugador extends Persona {
    private int numero_camiseta;


        public Jugador (String nombre_jugador, LocalDate fecha_nacimiento, int numero_camiseta){
             super(nombre_jugador,fecha_nacimiento);
            this.numero_camiseta=numero_camiseta;
        }

        public Jugador() {
            super();
            this.numero_camiseta = 10;
        }
    public int getNumero_camiseta() {
        return numero_camiseta;
    }

    public void setNumero_camiseta(int numero_camiseta) {
        this.numero_camiseta = numero_camiseta;
    }
}
