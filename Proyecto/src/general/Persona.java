package general;

import java.time.LocalDate;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private int edad;
    private LocalDate fNacimiento;


    public Persona() {
        this.nombre="Marcelo";
        this.apellido="Linares";
        this.dni=46789768;
        this.direccion="Carlos Antonio Lopez 443";
        this.edad=32;
        this.fNacimiento=LocalDate.of(1989,5,1);

    }


    public Persona(String nombre, String apellido, int dni, String direccion, int edad, LocalDate f){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.direccion=direccion;
        this.edad=edad;
        this.fNacimiento=f;
    }

    public Persona(String nombre, String apellido, int dni, String direccion, LocalDate f){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.direccion=direccion;
        this.fNacimiento=f;
    }
    public Persona(String nombre, String apellido, int dni,LocalDate f){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.fNacimiento=f;
    }
    public Persona(String nombre){
        this.nombre=nombre;
    }

    public Persona(String nombre, String apellido, LocalDate f){
        this.nombre=nombre;
        this.apellido=apellido;
        this.fNacimiento=f;
    }


    public Persona(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }

    public Persona(String nombre, LocalDate f){
        this.nombre=nombre;
        this.fNacimiento=f;
    }

     public Persona(String nombre, String direccion, int edad){
            this.nombre=nombre;
            this.direccion=direccion;
            this.edad=edad;
        }

        public Persona(String nombre, int dni, String apellido){
            this.nombre=nombre;
            this.apellido=apellido;
            this.dni=dni;
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

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public int getDni() {
            return dni;
        }

        public void setDni(int dni) {
            this.dni = dni;
        }

        public LocalDate getfNacimiento() {
            return fNacimiento;
        }

        public void setfNacimiento(LocalDate fNacimiento) {
            this.fNacimiento = fNacimiento;
        }

        public void Imprimir(){
            System.out.println("Nombre: " +nombre);
            System.out.println("Apellido: " +apellido);
            System.out.println("Direccion: " + direccion);
            System.out.println("Edad: " + edad);
            System.out.println("DNI: "+ dni);
            System.out.println("Fecha de Nacimiento: "+ fNacimiento);
        }


    }