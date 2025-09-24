package masterchef;

import receta.Entrada;
import receta.Plato;
import receta.platoPrincipal;

public class Experto extends Participante{
    private static int minutosCocina=80;

    public Experto(String nombre, String apellido, String direccion, ColorEquipo equipo) {
        super(nombre, apellido, direccion, equipo);
    }

    public static int getMinutosCocina() {
        return minutosCocina;
    }

    public static void setMinutosCocina(int minutosCocina) {
        Experto.minutosCocina = minutosCocina;
    }
    @Override
    public void prepararLugarTrabajo(){
        System.out.println("Perdi 5 minutos preparando la mesa por lo que mi tiempo restante es de "+(minutosCocina-5)+" minutos");
    }
    @Override//a la interfaz
    public void cocinar(Plato plato) throws NullPointerException {
                if (minutosCocina>=plato.getTiempoPreparado()) {
                    minutosCocina=minutosCocina- plato.getTiempoPreparado();
                    if(minutosCocina==0){
                        System.out.println("Con esta receta te quedaste sin tiempo disponible");
                    }
                    System.out.println("Se pudo cocinar el plato");
                }
                else{
                    throw new NullPointerException("No tiene el tiempo disponible suficiente");
                }
    }
}
