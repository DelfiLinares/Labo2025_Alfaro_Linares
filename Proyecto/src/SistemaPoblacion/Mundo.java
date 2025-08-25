package SistemaPoblacion;

import java.util.HashSet;
public class Mundo {
    private HashSet<Continente> continentes;
    private HashSet<Barrio> ciudades;
    private HashSet<Pais>paises;

    public Mundo(HashSet<Continente>continentes){
        this.continentes=continentes;

    }

    public HashSet<Continente> getContinentes() {
        return continentes;
    }

    public void setContinentes(HashSet<Continente> continentes) {
        this.continentes = continentes;
    }

public int poblacionPorCodigo(String codigo) {
    for (Continente cont : continentes) {
        if (cont.getCodigo().equals(codigo)) {
            return cont.poblacion(); // si es el continente, retorna su población
        }
        for (Pais p : cont.getPaises()) {
            if (p.getCodigo().equals(codigo)) {
                return p.poblacion(); // si es el país, retorna su población
            }
            for (Provincia pr : p.getProvincias()) {
                if (pr.getCodigo().equals(codigo)) {
                    return pr.poblacion(); // si es la provincia, retorna su población
                }
                for (Ciudad ciu : pr.getCiudades()) {
                    if (ciu.getCodigo().equals(codigo)) {
                        return ciu.poblacion(); // si es la ciudad, retorna su población
                    }
                    for (Barrio b : ciu.getBarrios()) {
                        if (b.getCodigo().equals(codigo)) {
                            return b.poblacion(); // si es el barrio, retorna su población
                        }
                    }
                }
            }
        }
    }
    public Continente continenteMasPoblado() {
        Continente max = null;
        int poblacionMax = -1;
        for (Continente cont : continentes) {
            int total = poblacionContinente(cont);
            if (total > poblacionMax) {
                poblacionMax = total;
                max = cont;
            }
        }
        return max;
    }


    public Continente continenteMenosPoblado() {
        Continente min = null;
        int poblacionMin = -1;
        for (Continente cont : continentes) {
            int total = poblacionContinente(cont);
            if (total < poblacionMin) {
                poblacionMin = total;
                min = cont;
            }
        }
        return min;
    }


    public Pais paisMasPoblado() {
        Pais max = null;
        int paisMax = -1;
        for (Pais p : paises) {
            int total = poblacionPais(p);
            if (total > paisMax) {
                paisMax = total;
                max = p;
            }
        }
        return max;
    }


    public Pais paisMenosPoblado() {
        Pais min = null;
        int paisMin = -1;
        for (Pais p : paises) {
            int total = poblacionPais(p);
            if (total < paisMin) {
                paisMin = total;
                min = p;
            }
        }
        return min;
    }


    private int poblacionContinente(Continente c) {
        int total = 0;
        for (Pais p : c.getPaises()) {
            total += poblacionPais(p);
        }
        return total;
    }

    private int poblacionPais(Pais p) {
        int total = 0;
        for (Provincia pr : p.getProvincias()) {
            for (Ciudad ciu : pr.getCiudades()) {
                for (Barrio b : ciu.getBarrios()) {
                    total += b.getPoblacion();
                }
            }
        }
        return total;
    }

    public void mostrarInfo() {
        System.out.println("País más poblado: " + paisMasPoblado().getNombre());
        System.out.println("País menos poblado: " + paisMenosPoblado().getNombre());
        System.out.println("Continente más poblado: " + continenteMasPoblado().getNombre());
        System.out.println("Continente menos poblado: " + continenteMenosPoblado().getNombre());
    }


    public static void main(String args[]) {
        HashSet<String> continentes = new HashSet<>();
        Barrio b=new Barrio("Villa Uquiza",23.1,45.2,1212);
        Ciudad c=new Ciudad("La Plata",45.3,26.3,500,new HashSet<>());
        System.out.println(b.getCodigo());
        System.out.println(c.getCodigo());

    }
}
