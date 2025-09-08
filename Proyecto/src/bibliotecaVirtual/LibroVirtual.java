package bibliotecaVirtual;
import biblioteca.Autor;

import java.util.HashSet;

public class LibroVirtual extends biblioteca.Libro{
    private Genero genero;
    private String nombrePDF;
    private int descargasDisps=145;
    public LibroVirtual(String titulo, Autor autor, Genero genero, String nombrePDF, int ISBN){
        super(titulo, autor, ISBN);
        this.genero=genero;
        this.nombrePDF=nombrePDF;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getNombrePDF() {
        return nombrePDF;
    }

    public void setNombrePDF(String nombrePDF) {
        this.nombrePDF = nombrePDF;
    }

    public int getDescargasDisps() {
        return descargasDisps;
    }

    public void setDescargasDisps(int descargasDisps) {
        this.descargasDisps = descargasDisps;
    }
}
