package prestamoLibros;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Usuario extends general.Persona{
    private int numSocio;
    private int creditoGanado;
    private String mail;
    private HashSet<Publicacion>leidas;
    private HashMap<Publicacion,Integer> leidasXcantVeces;
    private int acumuloMulta;

    public Usuario(int numSocio,String nombre, String apellido, LocalDate f, String mail){
        super(nombre,apellido,f);
        this.numSocio=numSocio;
        this.mail=mail;
        this.creditoGanado=0;
        this.leidas=new HashSet<>();
        this.leidasXcantVeces=new HashMap<>();
        this.acumuloMulta=0;
    }

    public int getCreditoGanado() {
        return creditoGanado;
    }

    public void setCreditoGanado(int creditoGanado) {
        this.creditoGanado = creditoGanado;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public HashSet<Publicacion> getLeidas() {
        return leidas;
    }

    public void setLeidas(HashSet<Publicacion> leidas) {
        this.leidas = leidas;
    }

    public HashMap<Publicacion, Integer> getLeidasXcantVeces() {
        return leidasXcantVeces;
    }

    public void setLeidasXcantVeces(HashMap<Publicacion, Integer> leidasXcantVeces) {
        this.leidasXcantVeces = leidasXcantVeces;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }
}

