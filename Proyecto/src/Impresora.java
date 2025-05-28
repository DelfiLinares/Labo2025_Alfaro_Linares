package compus;

public class Impresora extends Salida{
    String metodo;

    public Impresora(String fabricante, int modelo, double precio, int stock, String puertos, String metodo){
        super(fabricante, modelo, precio, stock, puertos);
        this.metodo=metodo;
    }
    public Impresora(){
        super();
        this.metodo="Láser";
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
}
