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
        Compra c1 = new Compra();
        Compra comprita = new Compra();
        double total = c1.calcularPrecioTotal();
        tienda.registrarVenta(comprita);
        System.out.println("Total de la compra: " + total);
        Compra comprapa = new Compra();
        tienda.mostrarDispositivos(comprapa);
    }


}
