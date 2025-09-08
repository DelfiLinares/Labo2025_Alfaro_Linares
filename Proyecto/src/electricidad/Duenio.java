package electricidad;

import java.util.HashSet;

public class Duenio extends general.Persona{
    private HashSet<Vivienda>propiedades;

    public Duenio(String nombre, String apellido, int dni){
        super(nombre, apellido, dni);
        this.propiedades=new HashSet<>();
    }

    public HashSet<Vivienda> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(HashSet<Vivienda> propiedades) {
        this.propiedades = propiedades;
    }
}
