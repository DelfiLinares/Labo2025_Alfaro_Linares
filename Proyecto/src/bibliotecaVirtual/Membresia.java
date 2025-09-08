package bibliotecaVirtual;

public enum Membresia {
    BRONCE(5), PLATA(15), ORO(50);
    private int cantLibros;

    private Membresia(int cant){
        this.cantLibros=cant;
    }

    public int getCantLibros() {
        return cantLibros;
    }

    public void setCantLibros(int cantLibros) {
        this.cantLibros = cantLibros;
    }
}
