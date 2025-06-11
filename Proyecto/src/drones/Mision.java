package drones;

public class Mision {
    static double latitud=-34.573195;
    static double longitud=-58.504111;
    Tipo tipo;

    public Mision(Tipo tipo){
        this.tipo=tipo;
    }

    public Mision(){
        this.tipo=Tipo.VIGILANCIA;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public static double getLongitud() {
        return longitud;
    }

    public static void setLongitud(double longitud) {
        Mision.longitud = longitud;
    }

    public static double getLatitud() {
        return latitud;
    }

    public static void setLatitud(double latitud) {
        Mision.latitud = latitud;
    }
}
