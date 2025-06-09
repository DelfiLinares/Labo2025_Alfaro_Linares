package tienda_electronica;

public class Sonido extends Producto{
    private boolean moduloB;

    public Sonido(boolean moduloB, String nombre, int stock, double precio, Seccion seccion){
        super(nombre, stock, precio, seccion);
        this.moduloB=moduloB;
    }

    public Sonido(){
        super();
        this.moduloB= true;
    }

    public boolean isModuloB() {
        return moduloB;
    }

    public void setModuloB(boolean moduloB) {
        this.moduloB = moduloB;
    }
}
