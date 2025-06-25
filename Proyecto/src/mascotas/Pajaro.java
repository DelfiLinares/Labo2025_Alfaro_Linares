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
        if(d.getNombre().equals(this.getDuenio().getNombre()) && d.getApellido().equals(this.getDuenio().getApellido())){
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
        setAlegria(this.alegria+1);
        System.out.println("Se alimentó a "+this.getNombre()+"// Nivel de alegría "+this.alegria);
    }
}
