package masterchef;

import receta.Plato;

public abstract class Participante extends general.Persona implements aptoCocinar{
    private ColorEquipo equipo;

    public Participante(String nombre, String apellido, String direccion, ColorEquipo equipo) {
        super(nombre, apellido, direccion);
        this.equipo = equipo;
    }

    public ColorEquipo getEquipo() {
        return equipo;
    }

    public void setEquipo(ColorEquipo equipo) {
        this.equipo = equipo;
    }

    public abstract void prepararLugarTrabajo();
}
