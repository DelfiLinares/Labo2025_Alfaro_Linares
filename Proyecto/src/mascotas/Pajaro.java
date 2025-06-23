package mascotas;

public class Pajaro extends Mascota{
    private boolean cantor;
    private String canto="pio, pio";

    public Pajaro(String nombre, Duenio duenio, boolean cantor, Animal tipo){
        super(nombre, duenio, tipo);
        this.cantor=cantor;
    }

    public boolean isCantor() {
        return cantor;
    }

    public void setCantor(boolean cantor) {
        this.cantor = cantor;
    }

    public String getCanto() {
        return canto;
    }

    public void setCanto(String canto) {
        this.canto = canto;
    }

    @Override
    public void saludo() {
        if(this.cantor){
            setCanto("chii, chii");
            System.out.println(this.canto);
        }
        else{
            System.out.println(this.canto);
        }
    }
    public static void main(String[] args) {
    Pajaro p=new Pajaro("Tobi", new Duenio(), true, Animal.PAJARO_C);
    }
}
