package compus;

public class Entrada extends Dispositivo{
    private String conector;
    private String puertos;


    public Entrada(String fabricante, int modelo, double precio, int stock, String conector, String puertos) {
        super(fabricante, modelo, precio, stock);
        this.puertos=puertos;
        this.conector=conector;
    }

    public Entrada(){
        super();
        this.puertos="USB";
        this.conector="coco";
    }
    public String getConector() {
        return conector;
    }

    public void setConector(String conector) {
        this.conector = conector;
    }

    public String getPuertos() {
        return puertos;
    }

    public void setPuertos(String puertos) {
        this.puertos = puertos;
    }

}
