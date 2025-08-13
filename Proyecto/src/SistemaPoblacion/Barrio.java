package SistemaPoblacion;

public class Barrio extends Lugar{
    private int poblacion;

    public Barrio(int poblacion, String nombre, int cod, String latitud, String longitud, Tipo tipo){
        super(nombre, cod, latitud, longitud, tipo);
        this.poblacion=poblacion;
    }

    public Barrio(){
        super();
        this.poblacion=1731820;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
}
