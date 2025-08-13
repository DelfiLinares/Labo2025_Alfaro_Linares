package SistemaPoblacion;

import vacunatorio.Provincia;

public class Lugar {
    private String nombre;
    private int cod;
    private String latitud;
    private String longitud;
    private Tipo tipo;

    public Lugar(String nombre, int cod, String latitud, String longitud, Tipo tipo){
        this.nombre=nombre;
        this.cod=cod;
        this.latitud=latitud;
        this.longitud=longitud;
        this.tipo=tipo;
    }

    public Lugar(){
        this.nombre="Tucumán";
        this.cod=1;
        this.latitud="26°49′00";
        this.longitud="65°13′00";
        this.tipo=Tipo.PROVINCIA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
