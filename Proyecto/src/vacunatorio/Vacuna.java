package vacunatorio;

import java.time.LocalDate;

public class Vacuna {
    private LocalDate fFabricacion;
    private LocalDate fAplicacion;
    private int numLote;
    private int numFabricacion;
    private String nombre;

    public Vacuna(LocalDate fFab, LocalDate fApl, int nLote, int nFab, String nom){
        this.fFabricacion=fFab;
        this.fAplicacion=fApl;
        this.numLote=nLote;
        this.numFabricacion=nFab;
        this.nombre=nom;
    }

    public LocalDate getfFabricacion() {
        return fFabricacion;
    }

    public void setfFabricacion(LocalDate fFabricacion) {
        this.fFabricacion = fFabricacion;
    }

    public LocalDate getfAplicacion() {
        return fAplicacion;
    }

    public void setfAplicacion(LocalDate fAplicacion) {
        this.fAplicacion = fAplicacion;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    public int getNumFabricacion() {
        return numFabricacion;
    }

    public void setNumFabricacion(int numFabricacion) {
        this.numFabricacion = numFabricacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
