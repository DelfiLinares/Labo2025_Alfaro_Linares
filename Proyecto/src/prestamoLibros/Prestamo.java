package prestamoLibros;

import java.time.LocalDate;

public class Prestamo {
    private Publicacion articulo;
    private int numSocio;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;

    public Prestamo(Publicacion articulo, int numSocio, LocalDate fechaInicio) {
        this.articulo = articulo;
        this.numSocio = numSocio;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaInicio.plusDays(15);
    }
}
