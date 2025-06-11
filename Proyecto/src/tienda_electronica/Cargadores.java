package tienda_electronica;

public class Cargadores extends Producto{
    int cantCargas;

    public Cargadores(String nombre, int stock, double precio, Seccion seccion, int cantCargas) {
        super(nombre, stock, precio, seccion);
        this.cantCargas = cantCargas;
    }

    public Cargadores(){
        super();
        this.cantCargas= 3;
    }

    public int getCantCargas() {
        return cantCargas;
    }

    public void setCantCargas(int cantCargas) {
        this.cantCargas = cantCargas;
    }
}

