package compus;

public class Dispositivo {
    private String fabricante;
    private int modelo;
    private double precio;
    private int stock;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Dispositivo(String fabricante, int modelo, double precio, int stock) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
    }

    public Dispositivo(){
        this.fabricante="Vikitori";
        this.modelo=500;
        this.precio=5000.02;
        this.stock=6;
    }
}
