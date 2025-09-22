package masterchef;

import java.time.LocalTime;

public class Expertos extends Participante{
    private static int minutosCocina=80;

    public Expertos(String nombre, String apellido, String direccion, ColorEquipo equipo) {
        super(nombre, apellido, direccion, equipo);
    }

    public static int getMinutosCocina() {
        return minutosCocina;
    }

    public static void setMinutosCocina(int minutosCocina) {
        Expertos.minutosCocina = minutosCocina;
    }
    @Override
    public void prepararLugarTrabajo(){
        System.out.println("Perdi 5 minutos preparando la mesa por lo que mi tiempo restante es de "+(minutosCocina-5)+" minutos");
    }
}
