import java.util.ArrayList;
import java.util.Scanner;

public class CD {
    private ArrayList<Cancion> Tracklist;

    public CD(ArrayList<Cancion> Tracklist){
        this.Tracklist = Tracklist;
    }

    public CD(){
        this.Tracklist = new ArrayList<Cancion>();
        Tracklist.add(new Cancion("Rape Me",new Persona("Nirvana")));
        Tracklist.add(new Cancion("Serve The Servants",new Persona("Nirvana")));
        Tracklist.add(new Cancion("Breed",new Persona("Nirvana")));
        Tracklist.add(new Cancion("Heartshaped Box",new Persona("Nirvana")));
    }

    public ArrayList<Cancion> getTracklist() {
        return Tracklist;
    }

    public void setTracklist(ArrayList<Cancion> tracklist) {
        Tracklist = tracklist;
    }

    public int numeroCanciones(CD cd){
      int cantidad=0;
      cantidad= Tracklist.size();
      return cantidad;
    }

    public Cancion posicion (CD cd){
        System.out.println("Ingresar índice: ");
        Scanner r = new Scanner(System.in);
        int indice= r.nextInt();
        System.out.println("Canción en la posición "+indice);
        Cancion aux=Tracklist.get(indice);
        return aux;
    }

    public void grabaCancion(int indice,Cancion nuevaCancion){
        System.out.println("----------------------");
        System.out.println("NUEVA CANCION");
        Scanner t= new Scanner(System.in);
        Tracklist.get(indice).setAutor(nuevaCancion.getAutor());
        Tracklist.get(indice).setTitulo(nuevaCancion.getTitulo());
    }

    public void agregar(Cancion cancionAgregada){
        this.Tracklist.add(cancionAgregada);
    }

    public static void main (String [] args) {
        ArrayList <Cancion> tracklist =new ArrayList<Cancion>();
        tracklist.add(new Cancion("Lala",new Persona()));
        tracklist.add(new Cancion("Lulu",new Persona()));
        tracklist.add(new Cancion("Lolo",new Persona()));
        CD cd= new CD(tracklist);
        System.out.println("Cantidad de canciones del CD= "+ cd.numeroCanciones(cd));
        Cancion cancion1=cd.posicion(cd);
        cancion1.Mostrar(cancion1);
        int indice=1;
        Cancion nuevaCancion=new Cancion("Venus Fly Trap",new Persona("Marina"));
        Cancion cancionAgregada=new Cancion("Smells Like Teen Spirit",new Persona("Nirvana"));
        cd.grabaCancion(indice,nuevaCancion);


    }

}

