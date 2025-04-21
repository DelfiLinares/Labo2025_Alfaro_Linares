import java.util.ArrayList;
import java.util.Scanner;

public class CD {
    private ArrayList<Cancion> Tracklist;
/*
    public CD(){
        this.Tracklist = new ArrayList<Cancion>();
    }*/

    public CD(){
        this.Tracklist = new ArrayList<Cancion>();
        Tracklist.add(new Cancion("Rape Me",new Persona("Nirvana")));
        Tracklist.add(new Cancion("Serve The Servant",new Persona("Nirvana")));
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

    public void posicion (CD cd){
        System.out.println("Ingresar índice: ");
        Scanner r = new Scanner(System.in);
        int indice= r.nextInt();
        Cancion aux=new Cancion();

    }

    public static void main (String [] args) {
        CD cd=new CD();
        System.out.println("Cantidad de canciones del CD= "+ cd.numeroCanciones(cd));

    }
}


