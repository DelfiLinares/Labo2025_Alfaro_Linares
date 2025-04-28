import java.util.ArrayList;

public class AlumnoBasico {

        //nombre, apellido, fechaNacimiento, listaDeNotas
        private String nombre;
        private String apellido;
        private Fecha fechaNacimiento;
        private ArrayList<Integer> notas;


        public AlumnoBasico(String nombre, String apellido, Fecha fechaNacimiento, ArrayList<Integer>notas) {
            this.nombre=nombre;
            this.nombre=nombre;
            this.apellido=apellido;
            this.fechaNacimiento=fechaNacimiento;
            this.notas=notas;
        }

        public AlumnoBasico(){
            this.nombre="Hector";
            this.apellido="Lesertesseur";
            this.fechaNacimiento=new Fecha(1,3,2024);
            this.notas=new ArrayList<Integer>();
            notas.add(3);
            notas.add(9);
            notas.add(7);
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public Fecha getFechaNacimiento() {
            return fechaNacimiento;
        }

        public void setFechaNacimiento(Fecha fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }

        public ArrayList<Integer> getNotas() {
            return notas;
        }

        public void setNotas(ArrayList<Integer> notas) {
            this.notas = notas;
        }

        public int mayorNota(AlumnoBasico alum){
            int mayor=notas.get(0);
            for(int i=0;i<this.notas.size();i++){;
                if(mayor<notas.get(i)){
                    mayor=notas.get(i);
                }
            }return mayor;
        }

    public int menorNota(AlumnoBasico alum){
        int menor=notas.get(0);
        for(int i=0;i<this.notas.size();i++){;
            if(menor>notas.get(i)){
                menor=notas.get(i);
            }
        }return menor;
    }
    public void agregarNota(int ingreso){
        notas.add(ingreso);
        System.out.println("Se agregó nota; "+ingreso);
    }

        public static void main (String [] args) {

            ArrayList<Integer>notas=new ArrayList<Integer>();
            notas.add(6);
            notas.add(7);
            notas.add(1);
            AlumnoBasico a1=new AlumnoBasico("Carlita","Wolf",new Fecha(1,2,2023),notas);
            System.out.println("Mayor nota de "+a1.getNombre() +" es: "+a1.mayorNota(a1));
            System.out.println("Menor nota de "+a1.getNombre() +" es: "+a1.menorNota(a1));
            a1.agregarNota(4);
        }

}