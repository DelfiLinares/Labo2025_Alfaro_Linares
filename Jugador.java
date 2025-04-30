public class Jugador {
    private String nombre_jugador;
    private Fecha fecha_nacimiento;
    private int numero_camiseta;



        public Jugador (String nombre_jugador, Fecha fecha_nacimiento, int numero_camiseta){
            this.nombre_jugador=nombre_jugador;
            this.fecha_nacimiento=fecha_nacimiento;
            this.numero_camiseta=numero_camiseta;
        }

        public Jugador() {
            this.nombre_jugador = "Hernan Grana";
            this.fecha_nacimiento = new Fecha(2, 6, 1987);
            this.numero_camiseta = 10;
        }

    public String getNombre_jugador() {
        return nombre_jugador;
    }

    public void setNombre_jugador(String nombre_jugador) {
        this.nombre_jugador = nombre_jugador;
    }

    public Fecha getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Fecha fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getNumero_camiseta() {
        return numero_camiseta;
    }

    public void setNumero_camiseta(int numero_camiseta) {
        this.numero_camiseta = numero_camiseta;
    }
}
