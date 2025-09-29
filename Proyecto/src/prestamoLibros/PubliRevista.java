package prestamoLibros;

import biblioteca.Autor;

public class PubliRevista extends Publicacion{
    private String distribuidora;

    public PubliRevista(String titulo, Autor autor, int anioPublicacion, int stock, String distribuidora) {
        super(titulo, autor, anioPublicacion, stock);
        this.distribuidora=distribuidora;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }
}
