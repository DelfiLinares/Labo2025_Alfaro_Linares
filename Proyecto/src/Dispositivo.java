public class Dispositivo {
    private String estado;
    private int medida;
    private int umbralI;
    private int anio;

    public Dispositivo(String estado, int medida, int umbralI, int anio) {
        this.estado = estado;
        this.medida = medida;
        this.umbralI = umbralI;
        this.anio = anio;
    }
    public Dispositivo(String estado, int umbralI, int anio) {
        this.estado = estado;
        this.umbralI = umbralI;
        this.anio = anio;
    }
    public Dispositivo() {
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

    public void alarma(){
        if(this instanceof DispConjunto){
            ((DispConjunto) this).alarmaCompuesta();
        }
        else {
            if (getMedida() > getUmbralI()) {
                System.out.println("Se activó una alarma");
                if (this instanceof DetectorHumo) {
                    System.out.println("DETECTOR DE HUMO - Llamada a bomberos... TEL " + ((DetectorHumo) this).getNumBomberos());
                    System.out.println("-----------------------------");

                }
                if (this instanceof SensorPresion) {
                    ((SensorPresion) this).activado = true;
                    System.out.println("SENSOR DE PRESION - Activado");
                    System.out.println("-----------------------------");

                }
                if (this instanceof SensorTemperatura) {
                    System.out.println("SENSOR DE TEMPERATURA -Cuidado la temperatura sube!");
                    System.out.println("-----------------------------");

                }
            } else {
                System.out.println(this.getClass().toString() + " no detectó disperfectos");
                System.out.println("-----------------------------");

            }
        }

    }


}
