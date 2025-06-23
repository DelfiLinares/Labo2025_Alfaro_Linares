package drones;

public class Mision {
    static double latitud=-34.573195;
    static double longitud=-58.504111;
    static double latitudDes;
    static double longitudDe;
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

    public static double getLatitudDes() {
        return latitudDes;
    }

    public static void setLatitudDes(double latitudDes) {
        Mision.latitudDes = latitudDes;
    }

    public static double getLongitudDe() {
        return longitudDe;
    }

    public static void setLongitudDe(double longitudDe) {
        Mision.longitudDe = longitudDe;
    }

    public double Haversine(double latitudOrigen, double longitudOrigen, double latitudDestino, double longitudDestino){
        // Convertir a radianes
        double lat1Rad = Math.toRadians(latitudOrigen);
        double lon1Rad = Math.toRadians(longitudOrigen);
        double lat2Rad = Math.toRadians(latitudDestino);
        double lon2Rad = Math.toRadians(longitudDestino);

        // Fórmula de Haversine
        double dLat = lat2Rad - lat1Rad;
        double dLon = lon2Rad - lon1Rad;
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double radioTierraKm = 6371;
        return radioTierraKm * c;
    }
}
