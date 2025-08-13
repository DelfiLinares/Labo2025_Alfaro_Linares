package controlCalorias;

import java.time.LocalDate;
import java.util.HashSet;

public class Familia{
    private String apellido;
    private HashSet<Miembro>miembros;

    public Familia(String apellido, HashSet<Miembro>miembros){
        this.apellido=apellido;
        this.miembros=miembros;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public HashSet<Miembro> getMiembros() {
        return miembros;
    }

    public void setMiembros(HashSet<Miembro> miembros) {
        this.miembros = miembros;
    }

    public double promedioCals(){
        double total=0.0;
        for(Miembro mAux:this.miembros){
            total+=mAux.cantCalorias();
        }
        return (total/miembros.size());
    }

    public Miembro masCals(){
        Miembro masCalorias=new Miembro("Ejemplo",LocalDate.now(),new HashSet<>());
        for(Miembro aux:this.miembros){
            if(aux.cantCalorias()>masCalorias.cantCalorias()){
                masCalorias=aux;
            }
        }return masCalorias;
    }
    public Miembro menosCals(){
        Miembro menosCalorias=new Miembro();
        for(Miembro aux:this.miembros){
            if(aux.cantCalorias()<menosCalorias.cantCalorias()){
                menosCalorias=aux;
            }
        }return menosCalorias;
    }
}