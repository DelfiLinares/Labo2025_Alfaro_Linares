package compu;

import java.time.LocalDate;

public class Cliente extends Persona{
    private int telefono;
    private String metodoPago;

    public Cliente(String nombre, String apellido, int dni, LocalDate fechaNacimiento, LocalDate fechaIngreso, int telefono, String metodo) {
        super(nombre,apellido, dni, fechaNacimiento, fechaIngreso);
        this.telefono = telefono;
        this.metodoPago = metodo;
    }
    public Cliente() {
        super();
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