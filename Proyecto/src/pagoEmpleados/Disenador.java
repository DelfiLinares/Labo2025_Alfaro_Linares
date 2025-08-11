package pagoEmpleados;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Disenador extends general.Persona{
    private HashSet<Proyecto>proyectos;
    private double sueldo;
    private Comision comision;

    public Disenador(HashSet<Proyecto>proys, String nom, String apell, int dni, LocalDate fNacimiento, Comision com){
        super(nom, apell, dni, fNacimiento);
        this.proyectos=proys;
        this.comision=com;
    }

    public HashSet<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(HashSet<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public double getSueldo() {
        return this.saberSueldo();
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

    public void agregarProyecto(Proyecto pNuevo){
        this.proyectos.add(pNuevo);
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
    public void detallesProyecto(){
        for(Map.Entry<Proyecto, Double>entrada :this.cobroPorProyecto().entrySet()){
            Proyecto proy=entrada.getKey();
            Double cobro=entrada.getValue();
            System.out.println("Nombre:"+proy.getNombre()+" // Dinero Ganado:"+proy.getDineroGenerado()+" // Comisión: "+(cobro-cobroSinC(proy)));
        }
    }
}
