package sistema_almuerzos;
import colegio.Profesor;
import general.Persona;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Pedido {
    private LocalDate fecha;
    private Persona cliente;
    private LocalTime hora;
    private String estado;
    private ArrayList<Plato>platos;

    public Pedido(LocalDate fecha, Persona cliente, LocalTime hora, String estado,ArrayList<Plato>pla){
        this.fecha=fecha;
        this.cliente=cliente;
        this.hora=hora;
        this.estado=estado;

    }
    public Pedido(){
        this.fecha=LocalDate.of(2025,4,5);
        this.cliente=new Persona();
        this.hora=LocalTime.of(19,35);
        ArrayList<Plato>pla=new ArrayList<>();
        pla.add(new Plato());
        this.platos=pla;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }


    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

}
