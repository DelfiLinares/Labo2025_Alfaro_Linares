import java.lang.reflect.Array;
import java.time.LocalTime;
import java.util.ArrayList;
public class Estanteria {
    private int cod;
    private ArrayList<Pelicula>Estante=new ArrayList<>();

    public Estanteria(){
        this.cod=2;
        this.Estante=new ArrayList<Pelicula>();
        Estante.add(new Pelicula());
    }
    public Estanteria(int cod, ArrayList<Pelicula>estante){
        this.cod=cod;
        this.Estante=Estante;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public ArrayList<Pelicula> getEstante() {
        return Estante;
    }

    public void setEstante(ArrayList<Pelicula> estante) {
        Estante = estante;
    }
    public void agregar(Pelicula peli){
        this.Estante.add(peli);
        System.out.println("Se agregó "+ peli.getNombre()+" a la estantería número "+this.cod );
        System.out.println("----------------");
    }
    public void borrar(Pelicula peli){
        this.Estante.remove(peli);
        System.out.println("Se eliminó "+ peli.getNombre()+" a la estantería número "+this.cod );
        System.out.println("----------------");
    }
    public void modificar(Pelicula peli,Pelicula nuevapeli){
        for(Pelicula aux:this.Estante){
            if(peli.getNombre().equals(aux.getNombre())){
                aux.setNombre(nuevapeli.getNombre());
                aux.setGenero(nuevapeli.getGenero());
                aux.setTiempo(nuevapeli.getTiempo());
                aux.setDirectores(nuevapeli.getDirectores());
                aux.setActores(nuevapeli.getActores());
                aux.setIdiomas(nuevapeli.getIdiomas());

                System.out.println("Se modificó el título: "+ aux.getNombre() );
            }
            else{
                System.out.println("No hay coincidencias con esa película");
            }
        }
        System.out.println("----------------");
    }


}