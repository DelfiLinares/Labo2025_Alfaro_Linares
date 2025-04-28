import java.util.ArrayList;

public class Materia {
    private String nombre;
    private ArrayList<String>listaContenidos;
    private ArrayList<Alumno>alumnosInscriptos;

    public Materia(String nombre,  ArrayList<String>listaContenidos, ArrayList<Alumno>alumnosInscriptos){
        this.nombre=nombre;
        this.alumnosInscriptos=alumnosInscriptos;
        this.listaContenidos=listaContenidos;
    }

    public Materia(){
        this.nombre="Matemática";
        this.alumnosInscriptos=new ArrayList<>();
        this.listaContenidos=new ArrayList<>();
        listaContenidos.add("Suma");
        listaContenidos.add("Resta");
        listaContenidos.add("Multiplicación");
        alumnosInscriptos.add(new Alumno());
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getListaContenidos() {
        return listaContenidos;
    }

    public ArrayList<Alumno> getAlumnosInscriptos() {
        return alumnosInscriptos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListaContenidos(ArrayList<String> listaContenidos) {
        this.listaContenidos = listaContenidos;
    }

    public void setAlumnosInscriptos(ArrayList<Alumno> alumnosInscriptos) {
        this.alumnosInscriptos = alumnosInscriptos;
    }
}
