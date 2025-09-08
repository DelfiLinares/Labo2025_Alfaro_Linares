package bibliotecaVirtual;

import biblioteca.Autor;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Plataforma {
    private HashSet<LibroVirtual>biblioteca;
    private HashMap<Integer,Usuario>libroPrestadoXUsuario;

    public Plataforma(HashSet<LibroVirtual>biblioteca,HashMap<Integer,Usuario>libroPrestado){
        this.biblioteca=biblioteca;
        this.libroPrestadoXUsuario=libroPrestado;
    }

    public HashSet<LibroVirtual> getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(HashSet<LibroVirtual> biblioteca) {
        this.biblioteca = biblioteca;
    }

    public HashMap<Integer, Usuario> getLibroPrestadoXUsuario() {
        return libroPrestadoXUsuario;
    }

    public void setLibroPrestadoXUsuario(HashMap<Integer, Usuario> libroPrestadoXUsuario) {
        this.libroPrestadoXUsuario = libroPrestadoXUsuario;
    }

    public void borrar(LibroVirtual l1,HashSet<LibroVirtual>biblioteca){
        this.biblioteca.remove(l1);
    }
    public void agregar(LibroVirtual l2,HashSet<LibroVirtual>biblioteca){
        this.biblioteca.add(l2);
    }
    public void modificar(LibroVirtual libroCambiar, LibroVirtual libroNuevo, HashSet<LibroVirtual>biblioteca){
        for(LibroVirtual aux: this.biblioteca){
            if(aux==libroCambiar){
                this.biblioteca.remove(libroNuevo);
                this.biblioteca.add(libroNuevo);
            }
        }
    }
    public void prestamo(LibroVirtual librito, Usuario usuario){
        if(usuario.getTipoMembresia().getCantLibros()-(usuario.getLibrosPrestados().size())>0){
            System.out.println("Usuario puede pedir prestado un libro");
            if(librito.getDescargasDisps()>0){
                librito.setDescargasDisps(librito.getDescargasDisps()-1);
                System.out.println("El libro puede ser prestado");
            }
            else{
                System.out.println("El libro NO puede ser prestado");
            }
        }
        else{
            System.out.println("Usuario NO puede pedir prestado un libro");
        }
    }
    public void devolucion(LibroVirtual libroDevolver, Usuario usuario){

    }
    public static void main (String args[]){
        HashSet<LibroVirtual>bibliografia1=new HashSet<>();
        LibroVirtual libro1=new LibroVirtual("Fahrenheit",new Autor("Ray","Bradbury", LocalDate.of(1920,9,22), 6546546, bibliografia1), Genero.ROMANCE,"Fahrenheit", 45454);


    }
}
