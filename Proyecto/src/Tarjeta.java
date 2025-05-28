package compus;

import general.Persona;

import java.time.LocalDate;

public class Tarjeta extends MetodoPago{
    double recargo=0.05;
    int num;
    Persona titular;
    LocalDate vencimiento;

    public Tarjeta(String metodo, double recargo, int num, Persona titular, LocalDate vencimiento){
        super(metodo);
        this.recargo=recargo;
        this.num=num;
        this.titular=titular;
        this.vencimiento=vencimiento;
    }

    public Tarjeta(){
        super();
        this.recargo=0.05;
        this.num=141516272;
        this.titular=new Persona("Martin","Alfaro");
        this.vencimiento=LocalDate.of(2026,9,8);
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public LocalDate getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(LocalDate vencimiento) {
        this.vencimiento = vencimiento;
    }
}
