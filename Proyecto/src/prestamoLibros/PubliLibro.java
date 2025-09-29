package prestamoLibros;

import biblioteca.Autor;

public class PubliLibro extends Publicacion{
    private boolean tieneSaga;

    public PubliLibro(String titulo, Autor autor, int anioPublicacion, int stock) {
        super(titulo, autor, anioPublicacion, stock);
        this.tieneSaga=tieneSaga;
    }
}
