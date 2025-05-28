package videoclub;
import general.Persona;
import java.time.LocalTime;
import java.util.ArrayList;

public class Pelicula {
    private String nombre;
    private String genero;
    private LocalTime tiempo;
    private ArrayList<Persona> Directores;
    private ArrayList<Persona> Actores;
    private ArrayList<String> Idiomas;

    public Pelicula(String nombre, String genero, LocalTime tiempo,
                    ArrayList<Persona> Directores, ArrayList<Persona> Actores, ArrayList<String> Idiomas) {

        this.nombre = nombre;
        this.genero = genero;
        this.tiempo = tiempo;
        this.Directores = Directores;
        this.Actores = Actores;
        this.Idiomas = Idiomas;

    }

    public Pelicula() {
        this.nombre = "Skibidi film";
        this.genero = "Terror";
        this.tiempo =LocalTime.of(2, 4, 6);
        this.Directores = new ArrayList<Persona>();
        Directores.add(new Persona("Juliana", "Jose Leon 333", 35));
        this.Actores = new ArrayList<Persona>();
        Actores.add(new Persona("Eduardo", "Jose Cabra 444", 40));
        this.Idiomas = new ArrayList<String>();
        Idiomas.add("Inglés");
        Idiomas.add("Español");
        Idiomas.add("Portugues");
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

    public LocalTime getTiempo() {
        return tiempo;
    }

    public void setTiempo(LocalTime tiempo) {
        this.tiempo = tiempo;
    }

    public ArrayList<Persona> getDirectores() {
        return Directores;
    }

    public void setDirectores(ArrayList<Persona> directores) {
        Directores = directores;
    }

    public ArrayList<Persona> getActores() {
        return Actores;
    }

    public void setActores(ArrayList<Persona> actores) {
        Actores = actores;
    }

    public ArrayList<String> getIdiomas() {
        return Idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        Idiomas = idiomas;
    }

    public ArrayList<Persona> actoresMayoresDeEdad(){
        System.out.println("Mayores de edad");
        ArrayList<Persona>mayores=new ArrayList<>();
        for(Persona aux:this.Actores){
            if(aux.getEdad()>=18){
                mayores.add(aux);
            }
        }return mayores;

    }
    public void imprimir(){
        System.out.println(this.nombre);
        System.out.println(this.genero);
        System.out.println(this.tiempo);
       for (Persona d:getDirectores()){
           d.Imprimir();
       }
       for (Persona a:getActores()){
           a.Imprimir();
       }
    }

}