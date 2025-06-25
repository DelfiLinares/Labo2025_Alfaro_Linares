package mascotas;

public class Gato extends Mascota{
        private int alegria;

        public Gato(String nombre, Duenio duenio, Animal tipo, int alegria){
            super(nombre, duenio, tipo);
            this.alegria=alegria;
        }
        public Gato(){//nube
            super();
            this.alegria=10;
        }

        @Override
        public void saludo(Duenio d) {
            if(d==this.getDuenio()){
                for (int i=0; i<this.alegria;i++) {
                    System.out.println("miau");
                }
            }else{
                System.out.println("MIAU");
            }
        }

        @Override
        public void alimentar() {
            this.alegria+=1;
            System.out.println("Se alimentó al gato");
        }
    }

