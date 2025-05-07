import com.sun.source.tree.NewArrayTree;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Videoclub {
    private String direccion;
    private int codPostal;
    private ArrayList<Estanteria>Estanterias_VC=new ArrayList<>();
    private int comuna;

    public Videoclub(){
        this.direccion="Constituyentes 5628";
        this.codPostal=1980;
        this.Estanterias_VC=new ArrayList<Estanteria>();
        Estanterias_VC.add(new Estanteria());
        this.comuna=11;
    }
    public Videoclub(String direccion, int codpostal, ArrayList<Estanteria>Estanterias_VC, int comuna){
        this.direccion=direccion;
        this.codPostal=codPostal;
        this.Estanterias_VC=Estanterias_VC;
        this.comuna=comuna;
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

    public int getComuna() {
        return comuna;
    }

    public void setComuna(int comuna) {
        this.comuna = comuna;
    }

    public void agregar(Estanteria estante){
        this.Estanterias_VC.add(estante);
        System.out.println("Se agregó el estante "+ estante.getCod()+" a la estantería ");
    }
    public void borrar(Estanteria estante){
        this.Estanterias_VC.remove(estante);
        System.out.println("Se eliminó el estante "+ estante.getCod()+" de la estantería");
    }
    public void modificar(Estanteria estante, Estanteria nuevaestanteria){
        for(Estanteria aux:this.Estanterias_VC){
            if(estante.getCod()==aux.getCod()) {
                aux.setCod(nuevaestanteria.getCod());
                aux.setEstante(nuevaestanteria.getEstante());
                System.out.println("Se modificó la estantería. Estante actual:" + aux.getCod());
            }
        }
    }



}
