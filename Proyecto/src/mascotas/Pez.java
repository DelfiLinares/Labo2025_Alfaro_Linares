package mascotas;

public class Pez extends Mascota{
    private int vida=10;

    public Pez(String nombre, Duenio duenio, Animal tipo, int vida){
        super(nombre, duenio, tipo);
    }
    public Pez(){
        super();
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void alimentar() {
        setVida(this.vida+=1);
        System.out.println("Se alimentó a "+this.getNombre());
        System.out.println("Vida actual del pez: "+this.vida);
    }


    @Override
    public void saludo(Duenio d) {
        if(d.getNombre().equals(this.getDuenio().getNombre()) && d.getApellido().equals(this.getDuenio().getApellido())){
            setVida(this.vida-1);
        }
        else{
            setVida(0);
        }
        System.out.println("Vida actual del pez: "+this.vida);
    }

}
