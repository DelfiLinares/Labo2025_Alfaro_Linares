package prestamoLibros;

import biblioteca.Autor;

import java.time.LocalTime;

public class PubliAudioLibro extends Publicacion{
    private LocalTime duracion;
    private int pesoArchivo;

    public PubliAudioLibro(String titulo, Autor autor, int anioPublicacion, int stock, LocalTime duracion, int pesoArchivo) {
        super(titulo, autor, anioPublicacion, stock);
        this.duracion = duracion;
        this.pesoArchivo = pesoArchivo;
    }

    public LocalTime getDuracion() {
        return duracion;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }

    public int getPesoArchivo() {
        return pesoArchivo;
    }

    public void setPesoArchivo(int pesoArchivo) {
        this.pesoArchivo = pesoArchivo;
    }

}
