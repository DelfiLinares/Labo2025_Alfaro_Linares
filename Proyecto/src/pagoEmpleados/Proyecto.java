package pagoEmpleados;

import java.time.LocalDate;

public class Proyecto {
    private String nombre;
    private double dineroGenerado;

    public Proyecto(String n, double dinero){
        this.nombre=n;
       this.dineroGenerado=dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDineroGenerado() {
        return dineroGenerado;
    }

    public void setDineroGenerado(double dineroGenerado) {
        this.dineroGenerado = dineroGenerado;
    }

}
