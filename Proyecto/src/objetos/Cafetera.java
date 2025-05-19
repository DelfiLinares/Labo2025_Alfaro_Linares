package objetos;//Modelar una objetos.Cafetera con los siguientes atributos y métodos:
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


import java.util.Scanner;

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
        this.cantact=cantact;
        this.cantmax=cantmax;
        if(cantact>cantmax){
            this.cantact=1000;
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

    public void llenar (Cafetera cafeterita){
        System.out.println("----------------------");
        if(this.cantact<this.cantmax){
            cantact=cantmax;
        }
        System.out.println("Se llenó la cafetera; Cant actual en la cafetera="+cantact);
    }

    public void llenarTaza (Cafetera cafeterita){
        System.out.println("----------------------");
        System.out.println("Indicar cuán llena quiere la taza(cc): ");
        Scanner r = new Scanner(System.in);
        int canttaza = r.nextInt();

        if(canttaza>this.cantact){
            System.out.println("objetos.Cafetera no tiene suficiente café");
        }
        else{
            this.cantact=this.cantact-canttaza;
            System.out.println("Se llenó la taza; Cant actual en la cafetera="+cantact);
        }

    }


    public void vaciar (Cafetera cafeterita){
        System.out.println("----------------------");
        if(this.cantact!=0){
            cantact=0;
        }
        System.out.println("Se vació la cafetera; Cant actual en la cafetera="+cantact);
    }

    public void agergarCafe (Cafetera cafeterita){
        System.out.println("----------------------");
        System.out.println("Indicar cuánto café quiere agregar: ");
        Scanner r = new Scanner(System.in);
        int cantCafeaux = r.nextInt();

        if(this.cantact+cantCafeaux<=this.cantmax){
            cantact+=cantCafeaux;
            System.out.println("Se agregó café a la cafetera; Cant actual en la cafetera="+cantact);
        }
        else{
            System.out.println("objetos.Cafetera no tiene suficiente capacidad");
        }

    }

    public static void main (String [] args) {
        Cafetera cafeterita = new Cafetera(1000, 1500);
        cafeterita.llenar(cafeterita);
        cafeterita.llenarTaza(cafeterita);
        cafeterita.vaciar(cafeterita);
        cafeterita.agergarCafe(cafeterita);
    }
}
