package videoclub;
import general.Persona;
import java.time.LocalTime;
import java.util.ArrayList;

public class Sistema {
   private  ArrayList<Videoclub>Videoclubes=new ArrayList<>();

    public Sistema(){
        this.Videoclubes=new ArrayList<Videoclub>();
        Videoclubes.add(new Videoclub());
    }
    public Sistema(ArrayList<Videoclub>Videoclubes){
        this.Videoclubes=Videoclubes;
    }

    public ArrayList<Videoclub> getVideoclubes() {
        return Videoclubes;
    }

    public void setVideoclubes(ArrayList<Videoclub> videoclubes) {
        Videoclubes = videoclubes;
    }



    public void agregar(Videoclub videoclub){
        this.Videoclubes.add(videoclub);
        System.out.println("Se agregó el local de  "+ videoclub.getDireccion()+" al sistema");
        System.out.println("----------------");
    }
    public void borrar(Videoclub videoclub){
        this.Videoclubes.remove(videoclub);
        System.out.println("Se eliminó el local de "+ videoclub.getDireccion()+" del sistema");
        System.out.println("----------------");
    }
    public void modificar(Videoclub videoclub, Videoclub nuevovc){
        for(Videoclub aux:this.Videoclubes){
            if(aux.getDireccion().equals(videoclub.getDireccion())) {
                aux.setDireccion(nuevovc.getDireccion());
                aux.setCodPostal(nuevovc.getCodPostal());
                aux.setEstanterias_VC(nuevovc.getEstanterias_VC());
                aux.setComuna(nuevovc.getComuna());
                System.out.println("Se modificó un local. Local actual:" + aux.getDireccion());
            }
        }System.out.println("----------------");
    }

    public ArrayList<String>comunaParticular(int num){
        ArrayList<String>direcciones=new ArrayList<>();
        for(Videoclub v:this.Videoclubes) {
            if(v.getComuna()==num){
                direcciones.add(v.getDireccion());
            }
        }return direcciones;
    }


    public static void main (String [] args) {
        ArrayList<Persona> directores=new ArrayList<>();
        directores.add(new Persona("James Francis Cameron","Canadá",70));
        ArrayList<Persona>actores=new ArrayList<>();
        actores.add(new Persona("Leonardo DiCaprio","USA",50));
        ArrayList<String>idiomas=new ArrayList<>();
        idiomas.add("Inglés");
        Pelicula p1=new Pelicula("Titanic","Romance", LocalTime.of(2,30,45),directores, actores, idiomas);

        ArrayList<Persona>actores2=new ArrayList<>();
        actores2.add(new Persona("Cynthia Erivo","UK",38));
        Pelicula p2=new Pelicula("Wicked","Musical",LocalTime.of(3,10,00),directores, actores2, idiomas);


        ArrayList<Pelicula>estante=new ArrayList<>();
        estante.add(new Pelicula());
        estante.add(p2);
        Estanteria e1=new Estanteria(1,estante);

        ArrayList<Estanteria>estantes=new ArrayList<>();
        estantes.add(new Estanteria());
        Videoclub vc1=new Videoclub("Nueva York 2379",1230,estantes,11);
        Videoclub vc2=new Videoclub("Artigas 4582",1230,estantes,15);

        ArrayList<Videoclub>locales=new ArrayList<>();
        locales.add(new Videoclub());
        Sistema s1=new Sistema(locales);

        System.out.println("a)-------------");
        e1.agregar(p1);
        e1.borrar(p1);
        e1.agregar(p1);
        e1.modificar(p1, new Pelicula());
        e1.agregar(p2);

        vc1.agregar(e1);
        vc1.borrar(e1);
        vc1.agregar(e1);

        s1.agregar(vc1);
        s1.agregar(vc2);
        s1.borrar(vc1);
        s1.agregar(vc1);

        System.out.println("b)-------------");
        vc1.nombreYEstanteria();

        System.out.println("c)-------------");
        for(Persona aux: p2.actoresMayoresDeEdad()){
            aux.Imprimir();
        }
        System.out.println("e)-------------");
        System.out.println("Locales de una comuna particular:");
        for(String aux: s1.comunaParticular(11)){
            System.out.println(aux);
        }
        System.out.println("f)--------------");
        System.out.println("Películas con duración mayor a 90 mins:");
        for(Pelicula aux: vc1.mayorA90()){

        }
    }
}
