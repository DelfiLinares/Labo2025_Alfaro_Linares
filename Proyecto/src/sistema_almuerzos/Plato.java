package sistema_almuerzos;

public class Plato {
    private String nombre;
    private double precio;

    public Plato(String nombre, double precio){
        this.nombre=nombre;
        this.precio=precio;
    }
    public Plato(){
        this.nombre="Ñoquis";
        this.precio=5000.00;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void agregarPlato(String n, double p){

    }

}
