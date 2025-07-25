package compus;

public abstract class Componente {
         String fabricante;
         String modelo;
         double precio;
         int stock;

        public Componente(String fabricante, String modelo, double precio, int stock) {
            this.fabricante = fabricante;
            this.modelo = modelo;
            this.precio = precio;
            this.stock = stock;
        }

        public Componente(){
            this.fabricante= "Fabian";
            this.modelo= "Mega";
            this.precio= 10.3;
            this.stock= 4;
        }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
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
}

