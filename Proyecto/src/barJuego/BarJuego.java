package barJuego;

import bar.ClienteBar;
import elecciones.Jornada;
import tienda_electronica.Televisores;

import java.util.HashSet;

public class BarJuego {
    private HashSet<Diana>dianasUsadas;
    private HashSet<ClienteBar>clientes;
    private double dineroRecaudado;
    private HashSet<Beneficio>beneficiosimplementados;
    private HashSet<Beneficio>beneficiosacumulables;

    public BarJuego(HashSet<Diana> dianasUsadas, HashSet<ClienteBar> clientes) {
        this.dianasUsadas = dianasUsadas;
        this.clientes = clientes;
        this.dineroRecaudado = 0.00;
        this.beneficiosimplementados = new HashSet<>();
        this.beneficiosacumulables = new HashSet<>();
    }

    public HashSet<Diana> getDianasUsadas() {
        return dianasUsadas;
    }

    public void setDianasUsadas(HashSet<Diana> dianasUsadas) {
        this.dianasUsadas = dianasUsadas;
    }

    public HashSet<ClienteBar> getClientes() {
        return clientes;
    }

    public void setClientes(HashSet<ClienteBar> clientes) {
        this.clientes = clientes;
    }

    public double getDineroRecaudado() {
        return dineroRecaudado;
    }

    public void setDineroRecaudado(double dineroRecaudado) {
        this.dineroRecaudado = dineroRecaudado;
    }

    public HashSet<Beneficio> getBeneficiosimplementados() {
        return beneficiosimplementados;
    }

    public void setBeneficiosimplementados(HashSet<Beneficio> beneficiosimplementados) {
        this.beneficiosimplementados = beneficiosimplementados;
    }

    public HashSet<Beneficio> getBeneficiosacumulables() {
        return beneficiosacumulables;
    }

    public void setBeneficiosacumulables(HashSet<Beneficio> beneficiosacumulables) {
        this.beneficiosacumulables = beneficiosacumulables;
    }
    public void agregarBeneficio(Beneficio beneficio){
        this.beneficiosimplementados.add(beneficio);
        if(beneficio.tipo().equals("Acumulable")){
            this.beneficiosacumulables.add(beneficio);
        }
    }

    public int cantidadBeneficiosTragos(){
        int cantidad=this.beneficiosimplementados.size()-this.beneficiosacumulables.size();
        return cantidad;
    }
}
