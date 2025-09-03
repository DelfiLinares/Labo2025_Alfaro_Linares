package compus;

import java.util.ArrayList;
public class Tienda {
    private ArrayList<Compra> vendidas;

    public Tienda() {
        vendidas = new ArrayList<>();
    }

    public void registrarVenta(Compra comprita) {
        vendidas.add(comprita);
        comprita.actualizarStock();
    }

    public void mostrarDispositivos(Compra comprapa) {
        if (comprapa != null) {
            int cantidadEntrada = 0;
            int cantidadSalida = 0;

            if (comprapa.getDispositivosEntrada() != null) {
                cantidadEntrada = comprapa.getDispositivosEntrada().size();
            }

            if (comprapa.getDispositivosSalida() != null) {
                cantidadSalida = comprapa.getDispositivosSalida().size();
            }

            System.out.println("Dispositivos entrada: " + cantidadEntrada);
            System.out.println("Dispositivos salida: " + cantidadSalida);
        }

        else {
            System.out.println("La compra no existe");
        }
    }


    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        Entrada dEntrada1=new Entrada("LOL","3456",345.02,20,"USB","10");
        Entrada dEntrada2=new Entrada("LOL","3456",345.20,20,"USB","10");
        Impresora impresora1=new Impresora("HIHI","3",400.00,30,"20",MetodoImpresion.Laser);


        ArrayList<Entrada>dispsEntrada=new ArrayList<>();
        ArrayList<Salida>dispsSalida=new ArrayList<>();
        dispsEntrada.add(dEntrada1);
        dispsEntrada.add(dEntrada2);
        dispsSalida.add(impresora1);


        Compra c1 = new Compra(new Cliente(),new CPU(),3000.00,"LOL", dispsEntrada,dispsSalida);
        double total = c1.calcularPrecioTotal();
        tienda.registrarVenta(c1);
        System.out.println("Total de la compra: " + total);
        tienda.mostrarDispositivos(c1);
    }


}
