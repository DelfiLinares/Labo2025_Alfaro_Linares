package prestamoLibros;

import biblioteca.Autor;
import general.Persona;
// como título, autor, año de publicación y stock. Los tipos de publicaciones pueden
// ser libros (se agrega si tiene saga o no), revistas (se agrega nombre de la distribuidora)
// y audiolibros (se agrega duración del y peso del archivo)
public abstract class Publicacion {
    private String titulo;
    private Autor autor;
    private int anioPublicacion;
    private int stock;

    public Publicacion(String titulo, Autor autor, int anioPublicacion, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.stock = stock;//xd
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
