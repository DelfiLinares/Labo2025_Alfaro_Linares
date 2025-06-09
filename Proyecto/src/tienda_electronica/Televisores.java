package tienda_electronica;

public class Televisores extends Producto{
    String tecnologia;
    String resolucionP;

    public Televisores(String tecnologia, String nombre, int stock, double precio, Seccion seccion, String resolucionP) {
        super(nombre, stock, precio, seccion);
        this.tecnologia = tecnologia;
        this.resolucionP=resolucionP;
    }

    public Televisores() {
        super();
        this.tecnologia = "ultraHd";
        this.resolucionP= "1280x720 píxeles";
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getResolucionP() {
        return resolucionP;
    }

    public void setResolucionP(String resolucionP) {
        this.resolucionP = resolucionP;
    }
}
