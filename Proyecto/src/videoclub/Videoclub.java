package videoclub;

import java.time.LocalTime;
import java.util.ArrayList;


public class Videoclub {
    private String direccion;
    private int codPostal;
    private ArrayList<Estanteria> Estanterias_VC = new ArrayList<>();
    private int comuna;

    public Videoclub() {
        this.direccion = "Constituyentes 5628";
        this.codPostal = 1980;
        this.Estanterias_VC = new ArrayList<Estanteria>();
        Estanterias_VC.add(new Estanteria());
        this.comuna = 11;
    }

    public Videoclub(String direccion, int codpostal, ArrayList<Estanteria> Estanterias_VC, int comuna) {
        this.direccion = direccion;
        this.codPostal = codPostal;
        this.Estanterias_VC = Estanterias_VC;
        this.comuna = comuna;
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

    public void agregar(Estanteria estante) {
        this.Estanterias_VC.add(estante);
        System.out.println("Se agregó el estante " + estante.getCod() + " a la estantería ");
        System.out.println("----------------");
    }

    public void borrar(Estanteria estante) {
        this.Estanterias_VC.remove(estante);
        System.out.println("Se eliminó el estante " + estante.getCod() + " de la estantería");
        System.out.println("----------------");
    }

    public void modificar(Estanteria estante, Estanteria nuevaestanteria) {
        for (Estanteria aux : this.Estanterias_VC) {
            if (estante.getCod() == aux.getCod()) {
                aux.setCod(nuevaestanteria.getCod());
                aux.setEstante(nuevaestanteria.getEstante());
                System.out.println("Se modificó la estantería. Estante actual:" + aux.getCod());
            }
        }
        System.out.println("----------------");
    }

    public void nombreYEstanteria() {
        String nombreMayor = " ";
        int codMayor = 0;
        for (Estanteria aux_e : Estanterias_VC) {
            for (Pelicula aux : aux_e.getEstante()) {
                if (aux.getTiempo().isAfter(LocalTime.of(0, 0, 0))) {
                    nombreMayor = aux.getNombre();
                    codMayor = aux_e.getCod();
                }
            }
        }
        System.out.println("La película de mayor duración es " + nombreMayor + " en la estantería número " + codMayor);
    }

    public ArrayList<Pelicula> mayorA90() {
        ArrayList<Pelicula> mayorA90 = new ArrayList<>();
        for (Estanteria aux_e : Estanterias_VC) {
            for (Pelicula aux : aux_e.getEstante()) {
                if (aux.getTiempo().isAfter(LocalTime.of(1, 30, 0))) {
                    Pelicula mayor = aux;
                    mayorA90.add(mayor);
                }
            }
        }
        return mayorA90;
    }
}
