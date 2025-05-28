package banco_nacion;

import general.Persona;

import java.time.LocalDate;
import java.time.Period;

public class PersonaBanco extends Persona {
   private LocalDate fechaNacimiento;
    private LocalDate fechaIngreso;

    public PersonaBanco(String nombre, String apellido, int dni, LocalDate fN, LocalDate fI){
        super(nombre, apellido, dni);
        this.fechaNacimiento=fN;
        this.fechaIngreso=fI;
    }

    public PersonaBanco() {
        super();

    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int antiguedad() {
        return Period.between(fechaIngreso, LocalDate.now()).getYears();

    }

}