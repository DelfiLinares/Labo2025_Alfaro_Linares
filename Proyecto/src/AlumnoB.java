import java.util.ArrayList;

public class AlumnoB {
    //nombre, apellido, fechaNacimiento, listaDeNotas
    private String nombre;
    private String apellido;
    private Fecha fechaNacimiento;
    private ArrayList<Integer> notas;


    public AlumnoB(String nombre, String apellido, Fecha fechaNacimiento, ArrayList<Integer>notas) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.fechaNacimiento=fechaNacimiento;
        this.notas=notas;
    }

    public AlumnoB(){
        this.nombre="Hector";
        this.apellido="Lesertesseur";
        this.fechaNacimiento=new Fecha(1,3,2024);
        this.notas=new ArrayList<Integer>();
        notas.add(3);
        notas.add(9);
        notas.add(7);
        notas.add(1);
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

    public void mayorNota(AlumnoB alum){
        int mayor=0;
        for(int i=0;i<this.notas.size();i++){
            mayor=notas.get(i);
            if(mayor<notas.get(i+1)){
                mayor=notas.get(i+1);
            }
        }
        System.out.println("La nota más alta de "+this.nombre+" es: "+mayor);
    }


    public static void main (String [] args) {

            ArrayList<Integer>notas=new ArrayList<Integer>();
            notas.add(6);
            notas.add(7);
            notas.add(1);
            AlumnoB a1=new AlumnoB("Carlita","Wolf",new Fecha(1,2,2023),notas);
            a1.mayorNota(a1);
    }
}