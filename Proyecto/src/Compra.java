package compus;

public class Compra {
    CPU compu;
    Salida dispS;
    Entrada dispE;
    Cliente cliente;

    public Compra(CPU compu, Salida s,Entrada e, Cliente cliente){
        this.compu=compu;
        this.dispS=s;
        this.dispE=e;
        this.cliente=cliente;
    }
    public Compra(){
        this.compu=new CPU();
        this.dispS=new Salida();
        this.dispE=new Entrada();
        this.cliente=new Cliente();
    }

    public CPU getCompu() {
        return compu;
    }

    public void setCompu(CPU compu) {
        this.compu = compu;
    }

    public Salida getDispS() {
        return dispS;
    }

    public void setDispS(Salida dispS) {
        this.dispS = dispS;
    }

    public Entrada getDispE() {
        return dispE;
    }

    public void setDispE(Entrada dispE) {
        this.dispE = dispE;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
