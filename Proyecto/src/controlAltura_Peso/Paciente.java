package controlAltura_Peso;

import general.Persona;
import pagoEmpleados.Proyecto;

import java.time.LocalDate;
import java.time.Year;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Paciente extends Persona {
    private HashMap<LocalDate, Registro> registro;

    public Paciente(String nombre, String apellido, LocalDate f,HashMap<LocalDate, Registro> registro){
        super(nombre, apellido, f);
        this.registro=registro;
    }

    public HashMap<LocalDate, Registro> getRegistro() {
        return registro;
    }

    public void setRegistro(HashMap<LocalDate, Registro> registro) {
        this.registro = registro;
    }

    public void registrar(double altura, double peso, LocalDate f){
        Registro r=new Registro(altura, peso);
        this.registro.put(f,r);
    }

    public void segunFecha(LocalDate f){
        for(Map.Entry<LocalDate, Registro>entrada :this.registro.entrySet()) {
            LocalDate fecha = entrada.getKey();
            Registro registro = entrada.getValue();
            if(f.equals(fecha)){
                System.out.println("Fecha:"+f+ " Peso:"+registro.getPeso()+" Altura: "+registro.getAltura());
            }
        }
    }

    public double promedioAlturaAnual(){
        double sumatoriaA=0;
        int contador=0;
        for(Map.Entry<LocalDate, Registro>entrada :this.registro.entrySet()) {
            LocalDate fecha = entrada.getKey();
            Registro registro = entrada.getValue();
            if(fecha.getYear()==(LocalDate.now()).getYear()){
                contador+=1;
                sumatoriaA+=registro.getAltura();
            }
        }return (sumatoriaA/contador);
    }
    public double promedioPesoAnual(){
        double sumatoriaP=0;
        int contador=0;
        for(Map.Entry<LocalDate, Registro>entrada :this.registro.entrySet()) {
            LocalDate fecha = entrada.getKey();
            Registro registro = entrada.getValue();
            if(fecha.getYear()==(LocalDate.now()).getYear()){
                contador+=1;
                sumatoriaP+=registro.getPeso();
            }
        }return (sumatoriaP/contador);
    }

    public double porcentajeCrecimiento(LocalDate fMasAntigua, LocalDate fMasNueva){
        double porcentaje=0.0;
        double vInicial=0.0;
        double vFinal=0.0;
            if(this.registro.containsKey(fMasNueva) && (this.registro.containsKey(fMasAntigua))){
                vFinal=this.registro.get(fMasNueva).getAltura();
                vInicial=this.registro.get(fMasAntigua).getAltura();
                porcentaje=((vFinal-vInicial)/vInicial)*100;
            }
            return porcentaje;
    }
    public static void main (String args[]) {
        HashMap<LocalDate,Registro>registroHashMap=new HashMap<>();
        Paciente p=new Paciente("Delfina","Linares",LocalDate.of(2008,06,02), registroHashMap);
        p.registrar(1.60,62.3, LocalDate.of(2025,9,15));
        p.registrar(1.66,63.01, LocalDate.of(2025,10,16));
        p.segunFecha(LocalDate.of(2020,9,15));
        System.out.println("Promedio de peso anual: "+ p.promedioPesoAnual());
        System.out.println("Promedio de altura anual: "+ p.promedioAlturaAnual());
        System.out.println("Porcentaje de crecimiento entre el 2025-9-15 y el 2025-10-16 es:"+ p.porcentajeCrecimiento(LocalDate.of(2025,9,15),LocalDate.of(2025,10,16))+"%");
    }
}
