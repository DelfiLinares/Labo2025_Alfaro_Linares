package barJuego;

import bar.Alcoholica;
import bar.Azucarada;
import bar.Bebida;
import receta.Nivel;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashSet<BarJuego>bares;
    private HashSet<String>tiposDianas;
    private HashSet<beneficioAcumulable>acumulables;

    public Sistema(HashSet<BarJuego> bares, HashSet<String> tiposDianas, HashSet<beneficioAcumulable> acumulables) {
        this.bares = bares;
        this.tiposDianas = tiposDianas;
        this.acumulables = acumulables;
    }

    public HashSet<BarJuego> getBares() {
        return bares;
    }

    public void setBares(HashSet<BarJuego> bares) {
        this.bares = bares;
    }

    public HashSet<String> getTiposDianas() {
        return tiposDianas;
    }

    public void setTiposDianas(HashSet<String> tiposDianas) {
        this.tiposDianas = tiposDianas;
    }

    public HashSet<beneficioAcumulable> getAcumulables() {
        return acumulables;
    }

    public void setAcumulables(HashSet<beneficioAcumulable> acumulables) {
        this.acumulables = acumulables;
    }

    public Diana dianaMasPuntaje(){
        Diana mayorpuntaje=new DianaCircular("Ejemplo",Nivel.FACIL,new HashMap<>());
        int puntaje=0;
        for(BarJuego aux:this.bares){
            for(Diana dAux: aux.getDianasUsadas()){
                if(dAux.cantidadPuntajes()>puntaje){
                    mayorpuntaje=dAux;
                }
            }
        }return mayorpuntaje;
    }

    public static void main(String[] args) {

        HashMap<Integer,ColorDiana>listaPuntos1=new HashMap<>();
        listaPuntos1.put(15, ColorDiana.Rojo);
        listaPuntos1.put(10, ColorDiana.Amarillo);

        HashMap<Integer,ColorDiana>listaPuntos2=new HashMap<>();
        listaPuntos1.put(10, ColorDiana.Rojo);
        listaPuntos1.put(5, ColorDiana.Amarillo);
        listaPuntos1.put(3, ColorDiana.Blanco);

        Diana d1=new DianaCircular("Diana 1",Nivel.AVANZADO,listaPuntos1);
        Diana d2=new DianaRectangular("Diana 2",Nivel.FACIL,listaPuntos2, 3.0,4.0);
        Diana d3=new DianaCuadrada("Diana 3",Nivel.AVANZADO,2.0,listaPuntos2);


        System.out.println("Area:"+d1.calcularArea());
        System.out.println("Area:"+d2.calcularArea());
        System.out.println("Area:"+d3.calcularArea());

        HashSet<Diana>dianasLista1=new HashSet<>();
        dianasLista1.add(d1);
        dianasLista1.add(d2);

        HashSet<Diana>dianasLista2=new HashSet<>();
        dianasLista2.add(d3);

        BarJuego bar1=new BarJuego(dianasLista1,new HashSet<>());
        BarJuego bar2=new BarJuego(dianasLista2,new HashSet<>());

        HashSet<Azucarada>gaseosas=new HashSet<>();
        gaseosas.add(new Azucarada("Coca Cola",200));

        HashSet<Alcoholica>tragos=new HashSet<>();
        tragos.add(new Alcoholica("Coca Cola",200));

        bar1.agregarBeneficio(new BeneficioGaseosa("Jojojo","Delfi",gaseosas));
        bar1.agregarBeneficio(new BeneficioTrago("Jijiji","Euge",tragos));

        System.out.println("Beneficios de tragos="+bar1.cantidadBeneficiosTragos());

        HashSet<BarJuego>bares=new HashSet<>();
        bares.add(bar1);
        bares.add(bar2);

        Sistema s1=new Sistema(bares,new HashSet<>(),new HashSet<>());
        System.out.println("Diana con mayor variedad de puntajes:"+s1.dianaMasPuntaje().getNombre());
    }
}
