import java.util.ArrayList;

public class Pelicula {
    private String nombre;
    private String genero;
    private Hora tiempo;
    private Persona director;
    private Persona actor;
    private ArrayList <String> Idiomas;

    public Pelicula(String nombre, String genero, Hora tiempo,
                    Persona director, Persona actor, ArrayList <String> Idiomas){

            this.actor=actor;
            this.director=director;
            this.genero=genero;
            this.Idiomas=Idiomas;
            this.tiempo=tiempo;
            this.nombre=nombre;
    }

    public Pelicula(){
        this.nombre="Skibidi film";
        this.genero="Terror";
        this.tiempo=new Hora(2,4,6);
        this.director= new Persona();
        this.actor= new Persona("Pochochito", "New York 2564", 88);
        this.Idiomas= new ArrayList<String>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Hora getTiempo() {
        return tiempo;
    }

    public void setTiempo(Hora tiempo) {
        this.tiempo = tiempo;
    }

    public Persona getDirector() {
        return director;
    }

    public void setDirector(Persona director) {
        this.director = director;
    }

    public Persona getActor() {
        return actor;
    }

    public void setActor(Persona actor) {
        this.actor = actor;
    }

    public ArrayList<String> getIdiomas() {
        return Idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        Idiomas = idiomas;
    }




}
