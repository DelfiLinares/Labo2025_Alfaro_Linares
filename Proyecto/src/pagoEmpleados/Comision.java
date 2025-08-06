package pagoEmpleados;

public enum Comision {
    SIETE(7),OCHO(8),DOCE(12);
    private int numero;

    private Comision(int numero){
        this.numero=numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
