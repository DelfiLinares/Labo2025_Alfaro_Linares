package compus;

public class Cliente extends general.Persona{
    int telefono;
    String metodo_pago;

    public Cliente(String nombre, String apellido, int telefono, String metodo_pago){
        super(nombre,apellido);
        this.telefono=telefono;
        this.metodo_pago=metodo_pago;
    }
    public Cliente(){
        super();
        this.telefono=1551326951;
        this.metodo_pago="Efectivo";
    }
}
