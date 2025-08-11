package pagoEmpleados;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Map;

public class SistemaCobro {
    public static void main (String args[]){

        HashSet<Proyecto>proyectosD1=new HashSet<>();
        Disenador d1=new Disenador(proyectosD1,"Aby","Tedesco",48908978, LocalDate.of(2007,12,20),Comision.OCHO);
        Proyecto p1=new Proyecto("Just Dance",35000);
        Proyecto p2=new Proyecto("Máquina de Garra",40000);
        Proyecto p3=new Proyecto("Pácman",50000);
        d1.agregarProyecto(p1);
        d1.agregarProyecto(p2);
        d1.agregarProyecto(p3);

        System.out.println("Cantidad de proyectos de "+d1.getNombre()+":"+d1.cantProyectos());
        System.out.println("Sueldo: $"+d1.saberSueldo());
        System.out.println("Dinero que ganó en el proyecto "+p1.getNombre()+":$"+d1.cobroSinC(p1));
        System.out.println("Dinero que ganó en el proyecto "+p2.getNombre()+":$"+d1.cobroSinC(p2));
        d1.detallesProyecto();

    }
}
