package barJuego;

import bar.Alcoholica;

import java.util.HashSet;

public class BeneficioTrago extends Beneficio {
    private HashSet<Alcoholica>tragos;

    public BeneficioTrago(String nombre, String creador, HashSet<Alcoholica> tragos) {
        super(nombre, creador);
        this.tragos = tragos;
    }

    public HashSet<Alcoholica> getTragos() {
        return tragos;
    }

    public void setTragos(HashSet<Alcoholica> tragos) {
        this.tragos = tragos;
    }
}
