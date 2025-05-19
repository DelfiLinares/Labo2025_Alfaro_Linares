package banco_nacion;

import java.time.LocalDate;
import java.util.ArrayList;

public class BancoNacion {
    private String direccion;
    private boolean cajero;
    private boolean oficinas;
    private ArrayList<PersonaBanco> empleados=new ArrayList<>();

    public BancoNacion(String direccion, boolean cajero, boolean oficinas) {
        this.direccion = direccion;
        this.cajero = cajero;
        this.oficinas = oficinas;
        this.empleados = new ArrayList<>();
    }
    public BancoNacion() {
        this.direccion = "Calingasta 1830";
        this.cajero = true;
        this.oficinas = true;
        this.empleados = new ArrayList<>();
        empleados.add(new PersonaBanco());
    }

    public void agregarTrabajador(PersonaBanco p) {
        empleados.add(p);
    }

    public void cantidadTrabajadores() {
        System.out.println("Cantidad de trabajadores: " + empleados.size());
    }

    public PersonaBanco empleadoMayorAntiguedad() {
        PersonaBanco mayor = new PersonaBanco("Pa","Chorra",32323232, LocalDate.of(2005,5,7), LocalDate.now());
        for (PersonaBanco p : empleados) {
            if (p.getFechaIngreso().isBefore(mayor.getFechaIngreso())) {
                mayor = p;
            }
        }
        return mayor;
    }
}
