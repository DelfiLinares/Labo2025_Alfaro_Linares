import java.time.LocalDate;
import java.time.Period;

public class PersonaBanco {
    private String nombre;
    private String apellido;
    private int dni;
    private LocalDate fechaNacimiento;
    private LocalDate fechaIngreso;

    public PersonaBanco(String nombre, String apellido, int dni, LocalDate fechaNacimiento, LocalDate fechaIngreso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
    }

    public PersonaBanco() {
        this.nombre = "Mia";
        this.apellido = "Pistacho";
        this.dni = 43988965;
        this.fechaNacimiento = LocalDate.of(1990, 8, 1);
        this.fechaIngreso = LocalDate.of(2000,1,3);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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