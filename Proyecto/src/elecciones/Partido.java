package elecciones;

import java.time.LocalDate;
import java.util.HashSet;

public class Partido {
    private String nombre;
    private String direccionOficina;
    private int cantAfiliados;
    private HashSet<accionesMensajes>mensajeros;

    public Partido(String nombre, String direccionOficina, int cantAfiliados) {
        this.nombre = nombre;
        this.direccionOficina = direccionOficina;
        this.cantAfiliados = cantAfiliados;
        this.mensajeros=new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionOficina() {
        return direccionOficina;
    }

    public void setDireccionOficina(String direccionOficina) {
        this.direccionOficina = direccionOficina;
    }

    public int getCantAfiliados() {
        return cantAfiliados;
    }

    public void setCantAfiliados(int cantAfiliados) {
        this.cantAfiliados = cantAfiliados;
    }

    public HashSet<accionesMensajes> getMensajeros() {
        return mensajeros;
    }

    public void setMensajeros(HashSet<accionesMensajes> mensajeros) {
        this.mensajeros = mensajeros;
    }

    public void agregarMensajero(accionesMensajes mensajeroNuevo){
        this.mensajeros.add(mensajeroNuevo);
    }

    public void hacerCampania(){
        for(accionesMensajes mensajerito: this.mensajeros){
            mensajerito.enviarMensaje("Vote por el partido para un mejor futuro");
        }
    }

    public static void main(String[] args) {
        Partido p1=new Partido("Victoria Por El Pueblo","Echeverria 2324",10);
        p1.agregarMensajero(new Paloma("Negro","PalomaNegra","Londres",true, true));
        p1.agregarMensajero(new TelefonoMovil("Huawei","UWUWU",345, CompaniaTel.Claro, true, true));
        p1.agregarMensajero(new Trabajador("Aby","Tedesco",48908765,"Nueva York 3234", LocalDate.of(2007,12,20),253647383, 200000000.00, new Jornada(9,16)));
        p1.hacerCampania();
    }
}
