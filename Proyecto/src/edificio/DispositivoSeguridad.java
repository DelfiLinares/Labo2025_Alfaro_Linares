package edificio;

public abstract class DispositivoSeguridad {
    private String estado;
    private int medida;
    private int umbralI;
    private int anio;

    public DispositivoSeguridad(String estado, int medida, int umbralI, int anio) {
        this.estado = estado;
        this.medida = medida;
        this.umbralI = umbralI;
        this.anio = anio;
    }
    public DispositivoSeguridad(String estado, int umbralI, int anio) {
        this.estado = estado;
        this.umbralI = umbralI;
        this.anio = anio;
    }
    public DispositivoSeguridad() {
        this.estado="Conectado";
        this.medida=20;
        this.umbralI=50;
        this.anio=2019;

    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getMedida() {
        return medida;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }

    public int getUmbralI() {
        return umbralI;
    }

    public void setUmbralI(int umbralI) {
        this.umbralI = umbralI;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean controlEstado(){
        if(this.getEstado().equals("Conectado") ){
            return true;
        }
        else{
            setEstado("Conectado");
            return true;
        }
    }

    abstract void alarma();


}