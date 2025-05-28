package compus;

public class Salida extends Dispositivo{
    private String puertos;

    public Salida(String fabricante, int modelo, double precio, int stock, String puertos){
        super(fabricante, modelo, precio, stock);
        this.puertos=puertos;
    }
    public Salida(){
        super();
        this.puertos="HDMI";
    }

    public String getPuertos() {
        return puertos;
    }

    public void setPuertos(String puertos) {
        this.puertos = puertos;
    }
}
