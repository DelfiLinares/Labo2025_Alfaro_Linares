package vacunatorio;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Ciudadano extends general.Persona {
    private Provincia provincia;
    private String mail;
    private HashSet<Vacuna>listaVacunas=new HashSet<>();

    public Ciudadano(String nombre, String apellido, int dni, LocalDate fNacimiento, Provincia prov, String mail,HashSet<Vacuna>vacunas){
        super(nombre, apellido, dni, fNacimiento);
        this.provincia=prov;
        this.mail=mail;
        this.listaVacunas=vacunas;
    }
    public Ciudadano(){
        super();
        this.provincia=Provincia.CATAMARCA;
        this.mail="ciudadano@gmail.com";
        HashSet<Vacuna>vacunas=new HashSet<>();
        this.listaVacunas=vacunas;
    }
    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public HashSet<Vacuna> getListaVacunas() {
        return listaVacunas;
    }

    public void setListaVacunas(HashSet<Vacuna> listaVacunas) {
        this.listaVacunas = listaVacunas;
    }



    public void agregarVacuna(Vacuna vNueva){
        listaVacunas.add(vNueva);
        System.out.println("Se agregó la vacuna "+vNueva.getNombre());
    }
}
