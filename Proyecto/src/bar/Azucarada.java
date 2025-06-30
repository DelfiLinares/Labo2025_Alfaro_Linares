package bar;

public class Azucarada extends Bebida{
    private int cantAzucar;

    public Azucarada(String n, int cA){
        super(n);
        this.cantAzucar=cA;
    }

    public int getCantAzucar() {
        return cantAzucar;
    }

    public void setCantAzucar(int cantAzucar) {
        this.cantAzucar = cantAzucar;
    }

    @Override
    public void establecerPositividad() {
        this.setcPositividad(1);
    }

    @Override
    public void establecerNegatividad() {
        this.setcNegatividad(this.cantAzucar*10);
    }

    @Override
    public String tipo() {
        return "Azucarada";
    }

}
