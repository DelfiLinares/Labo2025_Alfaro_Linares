package bar;

public class Alcoholica extends bar.Bebida {
    private int cantAlcohol;

    public Alcoholica(String n, int cA){
        super(n);
        this.cantAlcohol=cA;
    }

    public int getCantAlcohol() {
        return cantAlcohol;
    }

    public void setCantAlcohol(int cantAlcohol) {
        this.cantAlcohol = cantAlcohol;
    }

    @Override
    public void establecerPositividad() {
        this.setcPositividad(0);
    }

    @Override
    public void establecerNegatividad() {
        this.setcNegatividad(this.cantAlcohol*20);
    }

    @Override
    public String tipo() {
        return "Alcoholica";
    }

    public static class Azucarada extends bar.Bebida {
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
}
