package tienda_electronica;

public class Producto {
    String nombre;
    int stock;
    double precio;
    Seccion seccion;

    public Producto(String nombre, int stock, double precio, Seccion seccion){
        this.nombre=nombre;
        this.seccion=seccion;
        this.precio=precio;
        this.stock=stock;
    }


    public Producto(){
        this.nombre="Televisor";
        this.seccion=Seccion.MULTIMEDIA;
        this.precio=300000.00;
        this.stock=50;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public void agregar(Producto nuevo){

    }
}
