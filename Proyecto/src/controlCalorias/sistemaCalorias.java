package controlCalorias;

import java.time.LocalDate;
import java.util.HashSet;

public class sistemaCalorias {
    private HashSet<Familia>familias;


    public static void main (String args[]) {

        HashSet<String> ingredientes1=new HashSet<>();
        HashSet<String>ingredientes2=new HashSet<>();
        ingredientes1.add("Harina");
        ingredientes1.add("Huevo");
        ingredientes2.add("Pescado");

        Miembro m = new Miembro("Paola", LocalDate.of(1987,5,6), new HashSet<>());
        m.agregarPlato(new PlatoCal("Fideos", ingredientes1,300));
        m.agregarPlato(new PlatoCal("Suchi",ingredientes2,400));
        Miembro m2=new Miembro("Lorena",LocalDate.of(1998,12,3),new HashSet<>());
        m2.agregarPlato(new PlatoCal("Pizza",ingredientes1,400));

        HashSet<Miembro>familiaLopez=new HashSet<>();
        familiaLopez.add(m);
        familiaLopez.add(m2);
        Familia f1=new Familia("López",familiaLopez);
        System.out.println("Promedio de cals consumidas de la familia "+f1.getApellido()+":"+f1.promedioCals());
        System.out.println("Cals consumidas por "+m.getNombre()+":"+m.cantCalorias());
        System.out.println("Miembro de la familia "+f1.getApellido()+" que consumió más calorías:"+f1.masCals().getNombre());
        System.out.println("Miembro de la familia "+f1.getApellido()+" que consumió menos calorías:"+f1.menosCals().getNombre());
    }
}
