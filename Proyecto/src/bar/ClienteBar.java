package bar;

import java.util.ArrayList;

public class ClienteBar extends general.Persona{
    private ArrayList<Bebida>consumos;
    private int cantidad;
    private int cHidratacion;

    public ClienteBar(String n, int dni, String a, ArrayList<Bebida>c){
        super(n,dni,a);
        this.consumos=c;
        this.cantidad=0;
        this.cHidratacion=0;
    }
    public ClienteBar(){
        super();
        this.consumos=new ArrayList<>();
        this.cantidad=0;
        this.cHidratacion=0;
    }

    public ArrayList<Bebida> getConsumos() {
        return consumos;
    }

    public void setConsumos(ArrayList<Bebida> consumos) {
        this.consumos = consumos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getcHidratacion() {
        return cHidratacion;
    }

    public void setcHidratacion(int cHidratacion) {
        this.cHidratacion = cHidratacion;
    }

    public ArrayList<String> bebidaYcantidad() {
        ArrayList<String> nuevoConsumos = new ArrayList<>();
        int n = 0;
        int az = 0;
        int al = 0;
        for (Bebida aux : this.consumos) {
            if (aux.tipo().equals("Neutra")) {
                n += 1;

            }
            if (aux.tipo().equals("Azucarada")) {
                az += 1;
            }
            if (aux.tipo().equals("Alcoholica")) {
                al += 1;
            }
        }

        nuevoConsumos.add("Neutras("+n+")");
        nuevoConsumos.add("Azucaradas("+az+")");
        nuevoConsumos.add("Alcoholicas("+al+")");
        return nuevoConsumos;
    }

    public int cantidadConsumos(){
        return this.consumos.size();
    }

    public int calculoHidratacion(){
        int coef=0;
        for(Bebida aux:this.consumos){
            coef+=aux.hidratacion();
        }return coef;
    }
}
