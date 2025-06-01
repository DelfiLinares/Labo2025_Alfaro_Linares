package compu;

import java.time.LocalDate;

public class Tarjeta {
    private String numeroTarjeta;
    private LocalDate vencimiento;
    private int cvv;
    private double recargo = 0.05;

    public Tarjeta(String numeroTarjeta, LocalDate vencimiento, int cvv, double recargo) {
        this.numeroTarjeta = numeroTarjeta;
        this.vencimiento = vencimiento;
        this.cvv = cvv;
        this.recargo = recargo;
    }
    public Tarjeta() {
        this.numeroTarjeta = "";
        this.vencimiento = LocalDate.of(2027,5,2);
        this.cvv = 122;
        this.recargo = 0.05;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public LocalDate getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(LocalDate vencimiento) {
        this.vencimiento = vencimiento;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    public double getRecargo() {
        return recargo;
    }
    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }
}
