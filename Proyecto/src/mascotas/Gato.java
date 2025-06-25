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

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    @Override
        public void saludo(Duenio d) {
            if(d.getNombre().equals(this.getDuenio().getNombre()) && d.getApellido().equals(this.getDuenio().getApellido())){
                for (int i=0; i<this.alegria;i++) {
                    System.out.println("miau");
                }
            }else{
                System.out.println("MIAU");
            }
        }

        @Override
        public void alimentar() {
            setAlegria(this.alegria+1);
            System.out.println("Se alimentó a "+this.getNombre()+"// Nivel de alegría: "+this.alegria);
        }
    }

