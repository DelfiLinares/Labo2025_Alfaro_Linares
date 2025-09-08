package electricidad;

public enum Mes {
    ENERO(1, "Enero"), FEBRERO(2, "Febrero"), MARZO(3, "Marzo"), ABRIL(4, "Abril"), MAYO(5,"Mayo"), JUNIO(6,"Junio"), JULIO(7,"Julio"), AGOSTO(8,"Agosto"), SEPTIEMBRE(9,"Septiembre"), OCTUBRE(10,"Octubre"), NOVIEMBRE(11,"Noviembre"), DICIEMBRE(12,"Diciembre");

    private int num;
    private String nombre;

    private Mes(int num, String nombre){
        this.num=num;
        this.nombre=nombre;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
