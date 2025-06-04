package compus;

import java.time.LocalDate;
import java.time.Period;

public class Cliente extends general.Persona{
    private int telefono;
    private String metodoPago;
    private LocalDate fIngreso;

    public Cliente(String nombre, String apellido, int dni, LocalDate fechaNacimiento, LocalDate fechaIngreso, int telefono, String metodo) {
        super(nombre,apellido, dni, fechaNacimiento);
        this.telefono = telefono;
        this.metodoPago = metodo;
        this.fIngreso=fechaIngreso;
    }
    public Cliente() {
        super();
        this.telefono=15678908;
        this.metodoPago="Tarjeta";
        this.fIngreso=LocalDate.of(2025,6,2);
    }

    public int antiguedad() {
        return Period.between(fIngreso, LocalDate.now()).getYears();
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
}