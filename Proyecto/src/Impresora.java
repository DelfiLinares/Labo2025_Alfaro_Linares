package compus;

public class Impresora extends Salida {
    private MetodoImpresion metodoImpresion;

    public Impresora(String fabricante, String modelo, double precio, int stock, String puerto, MetodoImpresion metodoImpresion) {
        super(fabricante, modelo, precio, stock, puerto);
        this.metodoImpresion = metodoImpresion;
    }
    public Impresora(){
        super();
        this.metodoImpresion=MetodoImpresion.Laser;
    }

    public MetodoImpresion getMetodoImpresion() {
        return metodoImpresion;
    }

    public void setMetodoImpresion(MetodoImpresion metodoImpresion) {
        this.metodoImpresion = metodoImpresion;
    }
}
