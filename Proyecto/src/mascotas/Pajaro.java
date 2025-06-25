package mascotas;

public class Pajaro extends Mascota{
    private boolean cantor;
    private int alegria;

    public Pajaro(String nombre, Duenio duenio, boolean cantor, Animal tipo, int alegria){
        super(nombre, duenio, tipo);
        this.cantor=cantor;
        this.alegria=alegria;
    }

    public boolean isCantor() {
        return cantor;
    }

    public void setCantor(boolean cantor) {
        this.cantor = cantor;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    @Override
    public void saludo(Duenio d) {
        if(d==this.getDuenio()){
            for(int i=0;i<this.alegria;i++) {
                if (this.cantor) {
                    System.out.println("Gluuuuuuuu");
                }
                else{
                    System.out.println("Pio");
                }
            }
        }
    }

    @Override
    public void alimentar() {
        this.alegria+=1;
    }
}
