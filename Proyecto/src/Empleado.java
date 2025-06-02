package llamadasTelefonicas;

import java.time.LocalDate;

public class Empleado extends general.Persona{
    private String pais;
    private int telefono;

    public Empleado(String nombre, String apellido, int dni, String pais, int telefono){
        super(nombre, apellido, dni);
        this.pais=pais;
        this.telefono=telefono;
    }

    public Empleado(){
        super();
        this.pais="Bolivia";
        this.telefono=45895432;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}
