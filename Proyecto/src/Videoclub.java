import com.sun.source.tree.NewArrayTree;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Videoclub {
    private String direccion;
    private int codPostal;
    private ArrayList<Estanteria>Estanterias_VC;

    public Videoclub(){
        this.direccion="Constituyentes 5628";
        this.codPostal=1980;
        this.Estanterias_VC=new ArrayList<Estanteria>();
        Estanterias_VC.add(new Estanteria());
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

    public ArrayList<Estanteria> getEstanterias_VC() {
        return Estanterias_VC;
    }

    public void setEstanterias_VC(ArrayList<Estanteria> estanterias_VC) {
        Estanterias_VC = estanterias_VC;
    }
}