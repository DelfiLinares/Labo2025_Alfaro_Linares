
public class Fecha {
    public int dia;
    public int mes;
    public int anio;

public Fecha(int dia, int mes, int anio){
    this.mes=mes;
    this.dia=dia;
    this.anio=anio;
}

public Fecha(){
    this.dia=2;
    this.mes=4;
    this.anio=2021;
}

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}

