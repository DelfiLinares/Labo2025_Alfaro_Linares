package tienda_electronica;

public class Televisores extends Producto{
    Tecnologia tecnologia;
    String resolucionP;

    public Televisores(Tecnologia tecnologia, String nombre, int stock, double precio, Seccion seccion, String resolucionP) {
        super(nombre, stock, precio, seccion);
        this.tecnologia = tecnologia;
        this.resolucionP=resolucionP;
    }

    public Televisores() {
        super();
        this.tecnologia = Tecnologia.CUATRO_K;
        this.resolucionP= "1280x720 píxeles";
    }

    public Tecnologia getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(Tecnologia tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getResolucionP() {
        return resolucionP;
    }

    public void setResolucionP(String resolucionP) {
        this.resolucionP = resolucionP;
    }


}
