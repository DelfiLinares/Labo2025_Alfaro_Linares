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
        this.vida+=1;
        System.out.println("Se alimentó al pez");
    }


    @Override
    public void saludo(Duenio d) {
        if(d==getDuenio()){
            this.vida-=1;
        }
        else{
            setVida(0);
        }
    }

}
