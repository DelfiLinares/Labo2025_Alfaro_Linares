public class Persona {
    private String nombre;
    private String direccion;
    private int edad;


    public Persona() {
    this.nombre="Marcelo";
    this.direccion="Carlos Antonio Lopez 443";
    this.edad=32;
    }

    public Persona(String nombre, String direccion, int edad){
        this.nombre=nombre;
        this.direccion=direccion;
        this.edad=edad;
    }

    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public int getEdad(){
        return edad;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }

    public void Imprimir(Persona personita){
        System.out.println("Nombre: " + personita.nombre);
        System.out.println("Direccion: " + personita.direccion);
        System.out.println("Edad: " + personita.edad);
    }
    public static void main (String [] args) {
        Persona personita = new Persona("Luciana", "Nueva York 333", 22);
        personita.Imprimir(personita);
    }

}
