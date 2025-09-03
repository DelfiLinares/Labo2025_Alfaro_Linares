package biblioteca;

import bibliotecaVirtual.LibroVirtual;

import java.time.LocalDate;
import java.util.HashSet;

public class Autor extends general.Persona{
    private HashSet<LibroVirtual>bibliografia;
    public Autor(String nombre, String apellido, LocalDate fNacimiento, int dni, HashSet<LibroVirtual>listaLibros){
        super(nombre, apellido, dni, fNacimiento);
        this.bibliografia=listaLibros;
    }
    public Autor(String nombre, String apellido){
        super(nombre,apellido);
    }

    public HashSet<LibroVirtual> getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(HashSet<LibroVirtual> bibliografia) {
        this.bibliografia = bibliografia;
    }
}
