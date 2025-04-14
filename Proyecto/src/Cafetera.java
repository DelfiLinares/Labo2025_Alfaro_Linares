//Modelar una Cafetera con los siguientes atributos y métodos:
//
//    Atributos: cantidadMaxima, cantidadActual
//    Métodos:
//        Constructor por defecto: Cantidad máxima = 1000cc, cantidad actual = 0cc.
//        Constructor con cantidad máxima: Inicializa cantidad actual a la capacidad máxima.
//        Constructor con cantidad máxima y actual:
//        Ajusta la cantidad actual si es mayor que la capacidad.
//        llenarCafetera(): Llena la cafetera al máximo.
//        servirTaza(int capacidad): Sirve café en una taza hasta la capacidad indicada.
//        vaciarCafetera(): Vacía la cafetera.
//        agregarCafe(int cantidad): Añade café a la cafetera.


public class Cafetera {
    private int cantmax;
    private int cantact;


    public Cafetera(){
        this.cantact=0;
        this.cantmax=1000;
    }
    public Cafetera(int cantmax){
        this.cantact=cantmax;
    }
    public Cafetera(int cantact, int cantmax){
        if(cantact>cantmax){

        }
    }
    public int getCantmax(){
        return cantmax;
    }

    public int getCantact(){
        return cantact;
    }

    public void setCantmax(int cantmax){
        this.cantmax=cantmax;
    }
    public void setCantact(int cantact){
        this.cantact=cantact;
    }



}
