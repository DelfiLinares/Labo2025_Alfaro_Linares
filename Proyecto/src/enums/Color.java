package enums;

public enum Color {
    Rojo("ff0000"), Azul("3333cc"),Amarillo("ffff00");
    private String hexa;

    private Color(String hexa){
        this.hexa=hexa;
    }

    public String getHexa() {
        return hexa;
    }

    public void setHexa(String hexa) {
        this.hexa = hexa;
    }
}
