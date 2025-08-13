package receta;

import tienda_electronica.Producto;

import java.time.LocalTime;
import java.util.ArrayList;

public class Plataforma {
    ArrayList<Plato> recetas;

    public Plataforma(ArrayList<Plato> recetas) {
        this.recetas = recetas;
    }

    public Plataforma() {
        this.recetas = new ArrayList<>();
        recetas.add(new platoPrincipal());
    }

    public ArrayList<Plato> getRecetas() {
        return recetas;
    }

    public void setRecetas(ArrayList<Plato> recetas) {
        this.recetas = recetas;
    }

    public void agregar(Plato p1) {
        this.recetas.add(p1);
    }

    public void eliminar(Plato p1) {
        this.recetas.remove(p1);
    }

    public void modificar(Plato p1, Plato nuevo) {
        for (Plato aux : recetas) {
            if (aux == p1) {
                aux = nuevo;
            }
        }
    }

    public void dificultad(Nivel n){
        System.out.println("----Los platos con nivel:"+n.name());
        for(Plato p: recetas){
            if (p.getNivel().equals(n)){
                System.out.println(p.getNombre());
            }
        }
    }
    public Plato mayorCantidadPasos(){
        int mayor=0;
        Plato mayorcant=new Entrada();//temporalmente es una entrada
        for(Plato p: recetas) {
            if (p.getPasos().size() > mayor) {
                mayor = p.getPasos().size();
                mayorcant = p;
            }
        }return mayorcant;
    }

    public void porTipo(String tipo){
        System.out.println("----Búsqueda por tipo:"+tipo);
        String t="class receta."+tipo;
        for(Plato p: recetas){
            String aux=p.getClass().toString();
            if(aux.equals(t)){
              System.out.println(p.getNombre());
            }
        }
    }


    public int cantidad(){
        return recetas.size();
    }
    public static void main(String[] args) {
        ArrayList<String>pasos=new ArrayList<>();
        ArrayList<String>pasos2=new ArrayList<>();
        pasos.add("Paso 1");
        pasos.add("Paso 2");
        pasos.add("Paso 3");
        pasos.add("Paso 4");
        pasos2.add("Paso 1");
        Entrada e=new Entrada("Rabas",Nivel.MEDIO, pasos, Temperatura.CALIENTE);
        platoPrincipal pp =new platoPrincipal("Milanesa a caballo", Nivel.FACIL, pasos2, LocalTime.of(0,30,32), 3);
        Postre po=new Postre("Torta Oreo",Nivel.FACIL, pasos2, -18, false);
        ArrayList<Plato>recetas=new ArrayList<>();
        recetas.add(e);
        recetas.add(pp);
        recetas.add(po);

        Plataforma p1=new Plataforma(recetas);
        Nivel nivelazo=Nivel.MEDIO;
        p1.dificultad(nivelazo);
        p1.porTipo("Postre");
        System.out.println("Cantidad de recetas:"+p1.cantidad());
        System.out.println("El plato con mayor cantidad de pasos es: "+p1.mayorCantidadPasos().getNombre());
    }
}