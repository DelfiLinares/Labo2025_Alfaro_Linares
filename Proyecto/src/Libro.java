//Crear una clase llamada Libro con los siguientes atributos y métodos:
//
//    Atributos: título, autor (usar la clase Persona), ISBN, páginas, editorial, fechaPublicacion (usar la clase Fecha)
//    Métodos:
//        Mostrar la información del libro
//        Comparar si la fecha de publicación es anterior a otro libro dado
//        3 constructores distintos a elección
//        Getters y setters

public class Libro {
    private String titulo;
    private Persona autor;
    private int ISBN;
    private int paginas;
    private String editorial;
    private Fecha fechaPublicacion;

    public Libro(String titulo, String editorial, Persona autor, int ISBN, int paginas, Fecha fechaPublicacion){
        this.titulo=titulo;
        this.autor=autor;
        this.ISBN=ISBN;
        this.paginas=paginas;
        this.editorial=editorial;
        this.fechaPublicacion=fechaPublicacion;
    }

    public Libro(){
        this.titulo="Harry Potter";
        this.autor= new Persona ();
        this.ISBN=12;
        this.paginas=350;
        this.editorial="Salamandra";
        this.fechaPublicacion= new Fecha();
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
    public String getEditorial(){
        return editorial;
    }
    public Fecha getFechaPublicacion(){
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
    public void setEditorial(String editorial){
        this.editorial=editorial;
    }
    public void setFechaPublicacion(Fecha fechaPublicacion){
        this.fechaPublicacion=fechaPublicacion;
    }

    public void Mostrar(){

    }


    public static void main (String [] args) {

    }
}


