package elecciones;

public class Jornada {
    private int inicioJornada;
    private int finalJornada;

    public Jornada(int inicioJornada, int finalJornada) {
        this.inicioJornada = inicioJornada;
        this.finalJornada = finalJornada;
    }

    public int getInicioJornada() {
        return inicioJornada;
    }

    public void setInicioJornada(int inicioJornada) {
        this.inicioJornada = inicioJornada;
    }

    public int getFinalJornada() {
        return finalJornada;
    }

    public void setFinalJornada(int finalJornada) {
        this.finalJornada = finalJornada;
    }
}
