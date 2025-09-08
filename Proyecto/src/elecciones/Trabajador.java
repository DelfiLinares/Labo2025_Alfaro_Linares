package elecciones;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Trabajador extends general.Persona implements accionesMensajes{
    private int CUIL;
    private double sueldo;
    private Jornada jornadaLaboral;

    public Trabajador(String nombre, String apellido, int dni, String direccion, LocalDate f, int CUIL, double sueldo, Jornada jornada) {
        super(nombre, apellido, dni, direccion, f);
        this.CUIL = CUIL;
        this.sueldo = sueldo;
        this.jornadaLaboral=jornada;
    }

    public int getCUIL() {
        return CUIL;
    }

    public void setCUIL(int CUIL) {
        this.CUIL = CUIL;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Jornada getJornadaLaboral() {
        return jornadaLaboral;
    }

    public void setJornadaLaboral(Jornada jornadaLaboral) {
        this.jornadaLaboral = jornadaLaboral;
    }
    public boolean estaEnSuJornada(){
        Scanner e=new Scanner(System.in);
        System.out.println("Ingresar hora actual");
        int hora=e.nextInt();
        if(hora==this.jornadaLaboral.getInicioJornada() || hora==this.jornadaLaboral.getFinalJornada() || hora>this.jornadaLaboral.getInicioJornada() && hora<this.jornadaLaboral.getFinalJornada()){
            return true;
        }
        else{
            System.out.println(this.getNombre()+" no está en su horario laboral");
            return false;
        }
    }
    @Override
    public void enviarMensaje(String mensaje) {
        if(this.estaEnSuJornada()){
            System.out.println("Yo, "+this.getNombre()+ " te invito a que…");
            System.out.println(mensaje);
        }
    }
}
