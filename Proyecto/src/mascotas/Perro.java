package mascotas;

public class Perro extends Mascota{
    private int alegria;

    public Perro(String nombre, Duenio duenio, Animal tipo, int alegria){
        super(nombre, duenio, tipo);
        this.alegria=alegria;
    }
    public Perro(){//nube
        super();
        this.alegria=10;
    }

    @Override
    public void saludo(Duenio d) {
        if(d==this.getDuenio()){
            for(int i=0; i<this.alegria;i++) {
                System.out.println("guau");
            }
        }else{
            System.out.println("GUAU");
        }
    }

    @Override
    public void alimentar() {
        this.alegria+=1;
        System.out.println("Se alimentó al perro");
    }
}
