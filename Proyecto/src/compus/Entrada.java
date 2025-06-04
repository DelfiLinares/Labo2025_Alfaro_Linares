package compus;

public class Entrada extends Componente {
        protected String tipoConector;
        protected String puerto;

        public Entrada(String fabricante, String modelo, double precio, int stock, String tipoConector, String puerto) {
            super(fabricante, modelo, precio, stock);
            this.tipoConector = tipoConector;
            this.puerto = puerto;
        }
            public Entrada(){
            super();
        }

    public String getTipoConector() {
        return tipoConector;
    }

    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }
}

