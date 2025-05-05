import com.sun.source.tree.NewArrayTree;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Videoclub {
    private String direccion;
    private int codPostal;
    private ArrayList <ArrayList <Pelicula>> ESTANTERIA;
    private ArrayList <Pelicula> ROMCOM;
    private ArrayList <Pelicula> MUSICAL;

    public Videoclub(String direccion, int codPostal, ArrayList <ArrayList <Pelicula>> ESTANTERIA){
        this.direccion=direccion;
        this.codPostal=codPostal;
        this.ESTANTERIA=ESTANTERIA;
    }

    public Videoclub(){
        this.direccion="Constituyentes 1215";
        this.codPostal= 1356;
        this.ESTANTERIA=new ArrayList<ArrayList<Pelicula>>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }


    public ArrayList<ArrayList<Pelicula>> getESTANTERIA() {
        return ESTANTERIA;
    }

    public void setESTANTERIA(ArrayList<ArrayList<Pelicula>> ESTANTERIA) {
        this.ESTANTERIA = ESTANTERIA;
    }

    public void agregarEstante(ArrayList<Pelicula>nuevoEstante){
        ESTANTERIA.add(nuevoEstante);
        System.out.println("Estante agregado!"+nuevoEstante);
    }

    public void agregarPelicula(Pelicula pelili){
        ESTANTERIA.getLast().add(pelili);
        System.out.println("Pelicula agregada!"+pelili.getNombre());
    }

    public Videoclub agregarVideoClub(){
        Videoclub nuevovc=new Videoclub("Calignasta 1830", 1450, ESTANTERIA);
        System.out.println("Video Club agregado!" +nuevovc.direccion);
        return nuevovc;

    }

    public static void main (String [] args){
        Pelicula pelili= new Pelicula();
        ArrayList<ArrayList<Pelicula>>Estanteria=new ArrayList<ArrayList<Pelicula>>();
        ArrayList<Pelicula>UNO=new ArrayList<Pelicula>();
        ArrayList<Pelicula>DOS=new ArrayList<Pelicula>();
        Estanteria.add(UNO);
        Estanteria.add(DOS);
        ArrayList<String>IDIOMAS=new ArrayList<String>();
        Videoclub vc1=new Videoclub("José León Cabezón 2121", 1532, Estanteria);

        ArrayList<Pelicula>nuevoEstante=new ArrayList<Pelicula>();
        vc1.agregarEstante(nuevoEstante);
        Videoclub vc2= vc1.agregarVideoClub();
        IDIOMAS.add("Inglés");
        IDIOMAS.add("Español");
        IDIOMAS.add("Portugues");
        Pelicula nuevapeli=new Pelicula("Frankenwenie", "TERROR", new Hora(1,40,0),new Persona("Tim Burton", "USA",68), new Persona("","",0), IDIOMAS);

    }
}
