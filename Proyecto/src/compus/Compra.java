package compus;

import java.util.ArrayList;

public class Compra {
    private Cliente cliente;
    private CPU cpu;
    private ArrayList<Entrada> dispositivosEntrada;
    private ArrayList<Salida> dispositivosSalida;
    private double total;
    private String pago;
    private Salida salida;
    private Entrada entrada;

    public Compra(Cliente cliente, CPU cpu, double total, String pago, ArrayList<Entrada>ent,ArrayList<Salida>sal) {
        this.cliente = cliente;
        this.cpu = cpu;
        this.total = total;
        this.pago = pago;
        this.dispositivosEntrada=ent;
        this.dispositivosSalida=sal;
    }

    public Compra() {
        this.dispositivosEntrada = new ArrayList<>();
        this.dispositivosSalida = new ArrayList<>();
        this.total = 0;
        this.pago = "efectivo";
        this.cliente = new Cliente();
        this.cpu = new CPU();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public ArrayList<Entrada> getDispositivosEntrada() {
        return dispositivosEntrada;
    }

    public void setDispositivosEntrada(ArrayList<Entrada> dispositivosEntrada) {
        this.dispositivosEntrada = dispositivosEntrada;
    }

    public ArrayList<Salida> getDispositivosSalida() {
        return dispositivosSalida;
    }

    public void setDispositivosSalida(ArrayList<Salida> dispositivosSalida) {
        this.dispositivosSalida = dispositivosSalida;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public void actualizarStock() {
        if (cpu.getStock() > 0) {
            cpu.setStock(cpu.getStock() - 1);
        }
        for (Entrada e : dispositivosEntrada) {
            if (e.getStock() > 0) {
                e.setStock(e.getStock() - 1);
            }
        }
        for (Salida s : dispositivosSalida) {
            if (s.getStock() > 0) {
                s.setStock(s.getStock() - 1);
            }
        }
    }

    public double calcularPrecioTotal() {
        double total = 0;

        // Precio base
        if (cpu != null) {
            total += cpu.getPrecio();
        }

        if (dispositivosEntrada != null) {
            for (Entrada e : dispositivosEntrada) {
                total += e.getPrecio();
            }
        }

        if (dispositivosSalida != null) {
            for (Salida s : dispositivosSalida) {
                total += s.getPrecio();
            }
        }

        // Recargo del 5% si el método de pago es con tarjeta
        if (pago != null && pago.equals("tarjeta")) {
            total += total * 0.05;
        }

        return total;
    }


}
