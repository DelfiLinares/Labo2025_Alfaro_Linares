import java.util.ArrayList;

public class BancoNacion {
    private String direccion;
    private boolean cajero;
    private boolean oficinas;
    private ArrayList<Persona> empleados;

    public BancoNacion(String direccion, boolean cajero, boolean oficinas) {
        this.direccion = direccion;
        this.cajero = cajero;
        this.oficinas = oficinas;
        this.empleados = new ArrayList<>();
    }

    public void agregarTrabajador(Persona p) {
        empleados.add(p);
    }

    public void cantidadTrabajadores() {
        System.out.println("Cantidad de trabajadores: " + empleados.size());
    }

    public Persona empleadoMayorAntiguedad() {
        Persona mayor = null;

        for (Persona p : empleados) {
                if (p.getFechaIngreso().isBefore(mayor.getFechaIngreso())) {
                    mayor = p;
                }

        }

        return mayor;
    }
}
