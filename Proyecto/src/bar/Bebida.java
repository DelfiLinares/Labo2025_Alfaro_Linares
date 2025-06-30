package bar;

public abstract class Bebida {
    private String nombre;
    private int cPositividad;
    private int cNegatividad;

    public Bebida(String n){
        this.nombre=n;
        this.cPositividad=0;
        this.cNegatividad=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getcPositividad() {
        return cPositividad;
    }

    public void setcPositividad(int cPositividad) {
        this.cPositividad = cPositividad;
    }

    public int getcNegatividad() {
        return cNegatividad;
    }

    public void setcNegatividad(int cNegatividad) {
        this.cNegatividad = cNegatividad;
    }

    public abstract void establecerPositividad();
    public abstract void establecerNegatividad();
    public abstract String tipo();
    public int hidratacion(){
        return (this.getcPositividad()-this.getcNegatividad());
    }
}
