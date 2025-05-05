import java.lang.reflect.Array;
import java.util.ArrayList;
public class Estanteria {
    private int cod;
    private ArrayList<Pelicula>Estante;

    public Estanteria(){
        this.cod=1;
        this.Estante=new ArrayList<Pelicula>();
        Estante.add(new Pelicula());
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
}
