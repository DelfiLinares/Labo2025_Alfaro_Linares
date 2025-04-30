import java.util.ArrayList;
public class Equipo {
    private String nombre_equipo;
    private String barrio;
    private int cantidad_jugadores = 11;
    private String disponibilidad_horaria;
    private ArrayList<Jugador>jugadores;

    public Equipo(String nombre_equipo, String barrio, int cantidad_jugadores, String disponibilidad_horaria, ArrayList<Jugador>jugadores){

        this.nombre_equipo=nombre_equipo;
        this.barrio=barrio;
        this.cantidad_jugadores=cantidad_jugadores;
        this.disponibilidad_horaria=disponibilidad_horaria;
        this.jugadores=jugadores;
    }

    public Equipo(){
        this.nombre_equipo="All Boys";
        this.barrio="Floresta";
        this.cantidad_jugadores = 11;
        this.disponibilidad_horaria="Tarde";
        this.jugadores=new ArrayList<Jugador>();
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public int getCantidad_jugadores() {
        return cantidad_jugadores;
    }

    public void setCantidad_jugadores(int cantidad_jugadores) {
        this.cantidad_jugadores = cantidad_jugadores;
    }

    public String getDisponibilidad_horaria() {
        return disponibilidad_horaria;
    }

    public void setDisponibilidad_horaria(String disponibilidad_horaria) {
        this.disponibilidad_horaria = disponibilidad_horaria;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void fixture(Equipo equipo){

        System.out.println("Partido 1");

    }

    public static void main (String [] args) {
        ArrayList<Jugador>jugadoresE1=new ArrayList<Jugador>();
        Jugador j1=new Jugador("A", new Fecha(12,01,2000),1);
        Jugador j2=new Jugador("B", new Fecha(15,06,1990),2);
        Jugador j3=new Jugador("C", new Fecha(11,03,1995),3);
        Jugador j4=new Jugador("D", new Fecha(10,10,2002),4);
        Jugador j5=new Jugador("E", new Fecha(7,11,2000),5);
        Jugador j6=new Jugador("F", new Fecha(1,01,2001),6);
        Jugador j7=new Jugador("G", new Fecha(2,03,2007),7);
        Jugador j8=new Jugador("H", new Fecha(6,07,2002),8);
        Jugador j9=new Jugador("I", new Fecha(19,06,2001),9);
        Jugador j10=new Jugador("J", new Fecha(20,12,1999),10);
        Jugador j11=new Jugador("K", new Fecha(27,05,1998),11);

        ArrayList<Jugador>jugadoresE2=new ArrayList<Jugador>();
        ArrayList<Jugador>jugadoresE3=new ArrayList<Jugador>();
        Equipo e1=new Equipo("All Boys", "Floresta", 11, "T",jugadoresE1);
        Equipo e2=new Equipo("River Plate", "Núñez", 11, "M",jugadoresE2);
        Equipo e3=new Equipo("Tigre", "Tigre", 11, "T",jugadoresE3);

    }

}
