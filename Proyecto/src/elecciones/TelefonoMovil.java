package elecciones;

public class TelefonoMovil extends compus.Componente implements accionesMensajes{
    private int numeroSerie;
    private CompaniaTel compania;
    private boolean tieneCredito;
    private boolean estaPrendido;

    public TelefonoMovil(String fabricante, String modelo, int numeroSerie, CompaniaTel compania, boolean tieneCredito, boolean estaPrendido) {
        super(fabricante, modelo);
        this.numeroSerie = numeroSerie;
        this.compania = compania;
        this.estaPrendido=estaPrendido;
        this.tieneCredito=tieneCredito;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public CompaniaTel getCompania() {
        return compania;
    }

    public void setCompania(CompaniaTel compania) {
        this.compania = compania;
    }

    public boolean isTieneCredito() {
        return tieneCredito;
    }

    public void setTieneCredito(boolean tieneCredito) {
        this.tieneCredito = tieneCredito;
    }

    public boolean isEstaPrendido() {
        return estaPrendido;
    }

    public void setEstaPrendido(boolean estaPrendido) {
        this.estaPrendido = estaPrendido;
    }
    @Override
    public void enviarMensaje(String mensaje) {
        if(this.tieneCredito && this.estaPrendido) {
            System.out.println("Conectando con la antena más cercana");
            System.out.println(mensaje);
        }
        else{
            System.out.println("No se pudo conectar");
        }
    }
}
