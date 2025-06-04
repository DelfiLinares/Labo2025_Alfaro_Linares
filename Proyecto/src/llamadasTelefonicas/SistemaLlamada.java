package llamadasTelefonicas;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class SistemaLlamada {
    private Empleado empleadoOrigen;
    private Empleado empleadoDestino;
    private LocalDate fecha;
    private LocalTime duracion;
    private ArrayList<Empleado> llamadas;
    private ArrayList<Empleado> empleados;

    public SistemaLlamada(Empleado empleadoOrigen, Empleado empleadoDestino, LocalDate fecha, LocalTime duracion) {
        this.empleadoOrigen = empleadoOrigen;
        this.empleadoDestino = empleadoDestino;
        this.fecha = fecha;
        this.duracion = duracion;
    }

    public SistemaLlamada() {
        this.empleadoOrigen = (new Empleado("Eugelin", "Tedesquito", 46784908, "Bolivia", 1567809876));
        this.empleadoDestino = (new Empleado("Abrilsita", "Leserteserita", 45678909, "Paraguay", 1567890987));
        this.fecha = LocalDate.of(2025, 4, 7);
        this.duracion = LocalTime.of(1, 5, 2);
    }

    public Empleado getEmpleadoOrigen() {
        return empleadoOrigen;
    }

    public void setEmpleadoOrigen(Empleado empleadoOrigen) {
        this.empleadoOrigen = empleadoOrigen;
    }

    public Empleado getEmpleadoDestino() {
        return empleadoDestino;
    }

    public void setEmpleadoDestino(Empleado empleadoDestino) {
        this.empleadoDestino = empleadoDestino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getDuracion() {
        return duracion;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }

    public void agregarLlamada(ArrayList<Empleado> llamadas, ArrayList<Empleado> empleados) {
        for (int i = 0; i < empleados.size(); i++) {
            llamadas.add(empleados.get(i));
        }
    }

    public ArrayList<Empleado> empleadosExterior(ArrayList<Empleado> empleados) {
        ArrayList<Empleado> empsExterior = new ArrayList<>();
        String tel = "";
        for (Empleado emp : empleados) {
            tel += emp.getTelefono();
            if (tel.indexOf(0) != '5' && tel.indexOf(1) != '4') {
                empsExterior.add(emp);
            }
        }
        return empsExterior;
    }

    public void ranking (ArrayList<Empleado>emps){
        ArrayList<Empleado>ranking;
    }

}