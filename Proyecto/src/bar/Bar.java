package bar;

import java.util.HashSet;

public class Bar {
    private HashSet<ClienteBar>clientes;

    public Bar(HashSet<ClienteBar>clientes){
        this.clientes=clientes;
    }

    public HashSet<ClienteBar> getClientes() {
        return clientes;
    }

    public void setClientes(HashSet<ClienteBar> clientes) {
        this.clientes = clientes;
    }

    public ClienteBar mayorHidratacion(){
        int mayorH=0;
        ClienteBar cAux=new ClienteBar();
        for (ClienteBar aux:this.clientes){
            if(aux.calculoHidratacion()>mayorH){
                mayorH=aux.calculoHidratacion();
                cAux=aux;
            }
        }return cAux;
    }

    public static void main(String[] args) {

        HashSet<Bebida>consumos=new HashSet<>();
        Alcoholica alc= new Alcoholica("Vodka",9);
        Alcoholica alc2= new Alcoholica("Fernet",7);
        Azucarada az= new Azucarada("Jugo de manzana",7);
        Neutra neu=new Neutra("Agua");
        Neutra neu2=new Neutra("Agua");
        consumos.add(alc);
        consumos.add(alc2);
        consumos.add(az);
        consumos.add(neu);

        HashSet<Bebida>consumos2=new HashSet<>();
        consumos2.add(neu);
        consumos2.add(neu2);

        ClienteBar c1= new ClienteBar("Ama",26526552, "Lia", consumos);
        ClienteBar c2= new ClienteBar("Eu",12528952, "Ge", consumos2);

        HashSet<ClienteBar>clientes=new HashSet<>();
        clientes.add(c1);
        clientes.add(c2);
        Bar b1=new Bar(clientes);

        alc.establecerPositividad();
        alc.establecerNegatividad();

        alc2.establecerPositividad();
        alc2.establecerNegatividad();

        az.establecerPositividad();
        az.establecerNegatividad();

        neu.establecerPositividad();
        neu.establecerNegatividad();

        neu2.establecerPositividad();
        neu2.establecerNegatividad();

        System.out.println(c1.getNombre()+" consumió "+c1.cantidadConsumos()+" bebidas");
        System.out.println(c2.getNombre()+" consumió "+c2.cantidadConsumos()+" bebidas");

        System.out.println("Lista de "+c1.getNombre());
        for (String aux:c1.bebidaYcantidad()){
            System.out.println(aux);
        }
        System.out.println("Lista de "+c2.getNombre());
        for (String aux:c2.bebidaYcantidad()){
            System.out.println(aux);
        }
        System.out.println(c1.calculoHidratacion());
        System.out.println(c2.calculoHidratacion());

        System.out.println("Cliente con mayor coeficiente de hidratación: "+ b1.mayorHidratacion().getNombre());
    }
}
