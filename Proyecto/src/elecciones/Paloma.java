package elecciones;

public class Paloma implements accionesMensajes{
    private String color;
    private String especie;
    private String nombre;
    private boolean aprendioMapa;
    private boolean sabeVolar;

    public Paloma(String color, String especie, String nombre, boolean aprendioMapa, boolean sabeVolar) {
        this.color = color;
        this.especie = especie;
        this.nombre = nombre;
        this.aprendioMapa = aprendioMapa;
        this.sabeVolar=sabeVolar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAprendioMapa() {
        return aprendioMapa;
    }

    public void setAprendioMapa(boolean aprendioMapa) {
        this.aprendioMapa = aprendioMapa;
    }

    public boolean isSabeVolar() {
        return sabeVolar;
    }

    public void setSabeVolar(boolean sabeVolar) {
        this.sabeVolar = sabeVolar;
    }

    @Override
    public void enviarMensaje(String mensaje) {
        if(this.sabeVolar) {
            System.out.println("Lanzando un papelito que dice:");
            System.out.println(mensaje);
        }
        else{
            System.out.println("No sabe volar");
        }
    }
}
