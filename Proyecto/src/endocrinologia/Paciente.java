package endocrinologia;

import java.time.LocalDate;

public class Paciente extends general.Persona{
    private String genero;
    private TipoSangre tipoSangre;

    public Paciente(String nombre, String apellido, LocalDate f, String genero, TipoSangre tipoSangre) {
        super(nombre, apellido, f);
        this.genero = genero;
        this.tipoSangre = tipoSangre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
}
