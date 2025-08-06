package pagoEmpleados;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public abstract class Disenador extends general.Persona{
    private HashSet<Proyecto>proyectos;
    private double sueldo;
    private Comision comision;

    public Disenador(HashSet<Proyecto>proys, String nom, String apell, int dni, LocalDate fNacimiento, Comision com){
        super(nom, apell, dni, fNacimiento);
        this.proyectos=proys;
        this.comision=com;
        this.sueldo=this.saberSueldo();
    }

    public HashSet<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(HashSet<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Comision getComision() {
        return comision;
    }

    public void setComision(Comision comision) {
        this.comision = comision;
    }

    public String tipoDisenador(){
        if(this.comision.equals(Comision.OCHO)){
            return "UX";
        }
        if(this.comision.equals(Comision.SIETE)){
            return "UI";
        }
        else{
            return "IT";
        }
    }
    public HashMap<Proyecto, Double> cobroPorProyecto(){
        HashMap<Proyecto, Double>proyectoXcobro=new HashMap<Proyecto,Double>();
        double cobro=0.0;
        for(Proyecto aux: this.proyectos){
            cobro= aux.getDineroGenerado()+(aux.getDineroGenerado()* comision.getNumero());
            proyectoXcobro.put(aux,cobro);
        }
        return proyectoXcobro;
    }

    public Double cobroSinC(Proyecto p){
        double cobro=0.0;
        for(Proyecto aux:this.proyectos) {
            if (aux == p) {
                cobro = aux.getDineroGenerado();
            }
        }
        return cobro;
    }
    public double saberSueldo(){
        double sueldoTotal=0;
        for(double aux: this.cobroPorProyecto().values()){
            sueldoTotal+=aux;
        }return sueldoTotal;
    }

    public int cantProyectos(){
        return this.proyectos.size();
    }
/*
    public void detallesProyecto(){
        for(Map.Entry<Proyecto, Double>entrada :this.cobroPorProyecto().entrySet()){

        }
    }*/
}
