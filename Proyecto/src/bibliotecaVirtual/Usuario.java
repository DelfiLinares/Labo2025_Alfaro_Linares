package bibliotecaVirtual;

import general.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public class Usuario extends Persona{
    private String mail;
    private Membresia tipoMembresia;
    private HashSet<LibroVirtual>librosPrestados;

    public Usuario(String nombre, String apellido, int dni, LocalDate fNaciminto, String mail, Membresia tipo){
        super(nombre,apellido,dni,fNaciminto);
        this.mail=mail;
        this.tipoMembresia=tipo;
        this.librosPrestados=new HashSet<>();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Membresia getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(Membresia tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    public HashSet<LibroVirtual> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(HashSet<LibroVirtual> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }


}
