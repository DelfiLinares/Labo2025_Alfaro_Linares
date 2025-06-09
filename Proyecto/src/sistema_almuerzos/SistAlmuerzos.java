package sistema_almuerzos;

import colegio.Profesor;
import general.Persona;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class SistAlmuerzos {
    private ArrayList<Pedido>pedidos;
    private ArrayList<Plato>menu;

    public SistAlmuerzos(ArrayList<Pedido>pedidos, ArrayList<Plato>platos){
        this.pedidos=pedidos;
        this.menu=platos;

    }

    public SistAlmuerzos(){
        ArrayList<Pedido>pedi=new ArrayList<>();
        pedi.add(new Pedido());
        this.pedidos=pedi;
        ArrayList<Plato>pla=new ArrayList<>();
        pla.add(new Plato());
        this.menu=pla;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<Plato> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Plato> menu) {
        this.menu = menu;
    }

    public void AgregarPlato(Plato p1){
        this.menu.add(p1);
    }

    public void ModificarPlato(Plato aModificar, Plato nuevo){
        for(Plato aux: menu){
            if(aux==aModificar){
                aux=nuevo;
            }
        }
    }

    public void EliminarPlato(Plato p1){
        this.menu.remove(p1);
    }

    public void AgregarPedido(Pedido ped1){
        this.pedidos.add(ped1);
    }
    public void ModificarPedido(Pedido aModificar, Pedido nuevo){
        for(Pedido aux: pedidos){
            if(aux==aModificar){
                aux=nuevo;
            }
        }
    }

    public void EliminarPedido(Pedido ped1){
        this.pedidos.remove(ped1);
    }

    public double porcentaje(double valor, double precio){
        return (valor/precio)*100;
    }

    public void mostrarPedidos(){
        for(Pedido aux:this.pedidos){
            System.out.println("Fecha del pedido: "+aux.getFecha());
            System.out.println("Cliente: "+aux.getCliente().getNombre());
            System.out.println("Estado: "+aux.getEstado());
            System.out.println("Hora: "+aux.getHora());
            for (Plato auxp: aux.getPlatos()){
                System.out.println("Plato:"+auxp.getNombre());
                System.out.println("Precio:"+auxp.getPrecio());
            }
        }
    }

    public void platosDelDia(){
        Plato p1=new Plato();
        for(Pedido aux:this.pedidos){
            if(aux.getFecha()== LocalDate.now()){
                for(Plato auxP: aux.getPlatos()){
                    p1=auxP;
                }
            }

            if(aux.getCliente() instanceof Profesor){
                double porcent=((Profesor) aux.getCliente()).getPorcentaje_descuento();
                double precioPlatoProfe= p1.getPrecio()-porcentaje(porcent,p1.getPrecio());
                System.out.println("Plato del día: "+p1.getNombre()+" precio: $"+precioPlatoProfe);
            }

            else{
                System.out.println("Plato del día: "+p1.getNombre()+" precio: $"+p1.getPrecio());

            }
        }
    }
    public static void main (String [] args) {
        ArrayList <Pedido>pediditos=new ArrayList<>();
        ArrayList <Plato>menu=new ArrayList<>();
        Plato plato1=new Plato("Ensalada de palta y kanikama",6000.00);
        Plato plato2=new Plato("Spaghettis a la pochochito",4500.00);
        Plato plato3=new Plato("Hambuguesa con papas",7000.00);
        Plato plato4=new Plato("Tortillinas de papa y zanahoria",3000.00);
        ArrayList<Plato>platosPedido1=new ArrayList<>();
        platosPedido1.add(plato1);
        platosPedido1.add(plato2);
        ArrayList<Plato>platosPedido2=new ArrayList<>();
        platosPedido2.add(plato3);
        ArrayList<Plato>platosPedido3=new ArrayList<>();
        platosPedido3.add(plato4);
        Pedido pedido1=new Pedido(LocalDate.now(),new ClienteAlmuerzo("Delfina","Linares"), LocalTime.of(12,20),"Preparando",platosPedido1);
        Pedido pedido2=new Pedido(LocalDate.now(),new ClienteAlmuerzo("Eugenio","Lesertesseur"), LocalTime.of(15,40),"En camino",platosPedido2);
        Pedido pedido3=new Pedido(LocalDate.of(2025,3,11),new ClienteAlmuerzo("Abrilsita","Tedesco"), LocalTime.of(22,13),"Entregado",platosPedido3);

        pediditos.add(pedido1);
        pediditos.add(pedido2);
        pediditos.add(pedido3);

        menu.add(plato1);
        menu.add(plato2);
        menu.add(plato3);
        menu.add(plato4);

        SistAlmuerzos s1=new SistAlmuerzos(pediditos,menu);
        s1.mostrarPedidos();




    }


}


