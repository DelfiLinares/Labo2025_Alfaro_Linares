package musica;
import general.Persona;

public class Cancion {
    private String titulo;
    private Persona autor;

    public Cancion() {
        this.titulo = " ";
        // this.autor = new (" "," ", 0);
    }

    public Cancion(String titulo, Persona autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    public String getTitulo(){
        return titulo;
    }
    public Persona getAutor(){
        return autor;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setAutor(Persona autor){
        this.autor=autor;
    }

    public void Mostrar (Cancion song){
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Autor: "+this.autor.getNombre());
    }
}
