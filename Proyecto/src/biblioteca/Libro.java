
package biblioteca;
import general.Persona;

import java.time.LocalDate;

public class Libro {
    private String titulo;
    private Persona autor;
    private int ISBN;
    private int paginas;
    private Editorial editorial;
    private LocalDate fechaPublicacion;

    public Libro(String titulo, Editorial editorial, Persona autor, int ISBN, int paginas, LocalDate fechaPublicacion){
        this.titulo=titulo;
        this.autor=autor;
        this.ISBN=ISBN;
        this.paginas=paginas;
        this.editorial=editorial;
        this.fechaPublicacion=fechaPublicacion;
    }

    public Libro(){
        this.titulo="Harry Potter";
        this.autor= new Persona ("Amanda","Lopez");
        this.ISBN=12;
        this.paginas=350;
        this.editorial=Editorial.Interzona;
        this.fechaPublicacion= LocalDate.of(2025,1,25);
    }

    public Libro(String titulo, String editorial, Persona autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public String getTitulo(){
        return titulo;
    }

    public Persona getAutor(){
        return autor;
    }

    public int getISBN(){
        return ISBN;
    }

    public int getPaginas(){
        return paginas;
    }
    public Editorial getEditorial(){
        return editorial;
    }
    public LocalDate getFechaPublicacion(){
        return fechaPublicacion;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setAutor(Persona autor){
        this.autor=autor;
    }
    public void setISBN(int ISBN){
        this.ISBN=ISBN;
    }
    public void setPaginas(int paginas){
        this.paginas=paginas;
    }
    public void setEditorial(Editorial editorial){
        this.editorial=editorial;
    }
    public void setFechaPublicacion(LocalDate fechaPublicacion){
        this.fechaPublicacion=fechaPublicacion;
    }

    public void Mostrar(Libro librito){
        System.out.println("El titulo es: " + this.titulo);
        System.out.println("El autor del libro es: " + this.autor.getNombre());
        System.out.println("La editorial es: " + this.editorial);
        System.out.println("El ISBN es: " + this.ISBN);
        System.out.println("La cantidad de págs es: " + this.paginas);
        System.out.println("La fecha de publicacion es: " +this.getFechaPublicacion().getMonth()+"-"+this.getFechaPublicacion().getYear());
    }


    public static void main (String [] args) {
        Libro librito = new Libro("pochochito story", Editorial.Atlantida, new Persona(),2,300, LocalDate.of(2023,6,9));
        librito.Mostrar(librito);
    }
}


