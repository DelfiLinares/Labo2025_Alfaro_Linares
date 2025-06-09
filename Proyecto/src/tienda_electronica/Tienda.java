package tienda_electronica;

import java.util.ArrayList;

public class Tienda {
    ArrayList<Producto> productos;

    public void agregar(Producto p1){
        productos.add(p1);
    }
    public void eliminar(Producto p1){
        productos.remove(p1);
    }
    public void modificar(Producto p1, Producto nuevo){
        for(Producto aux: productos){
            if(aux==p1){
                aux=nuevo;
            }
        }
    }

    public  void  mayorStock(){
        int mayor=0;
        Producto prodMayor=new Producto();
        for(Producto p: productos) {
            if (p.getStock() > mayor) {
                mayor = p.getStock();
                prodMayor=p;
            }
        }
        System.out.println("El producto con mayor stock es:"+prodMayor.getNombre());
    }
    public  void  menorStock(){
        int menor=0;
        Producto prodMenor=new Producto();
        for(Producto p: productos) {
            if (p.getStock() < menor){
                menor = p.getStock();
                prodMenor=p;
            }
        }
        System.out.println("El producto con mayor stock es:"+prodMenor.getNombre());
    }
}
