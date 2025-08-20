package mainExcepciones;

public class mainTryCatch {

    public static int nombreLenght(String n) throws NullPointerException{
        return n.length();
    }
    public static int nombreLenghtExcepcionPropia(String n) throws StringNuloExcepcion{
        return n.length();
    }
    public static void main(String[] args) {
        //solo con try/catch
        try{
            String nombre1 = null;
            System.out.println("El largo del nombre es:" + nombre1.length());

        }
        catch(NullPointerException nullito){
            System.out.println("No se ingresó un nombre");
        }

        //solo con throw
        try {
            String nombre2 = null;
            if(nombre2 == (null)){
                throw new NullPointerException("No se ingresó nombre");
            }
            System.out.println("El largo del nombre es:" + nombre2.length());
        }
        catch(NullPointerException nullito){
            System.err.println(nullito);
        }

        //solo con throws
        try{
            String n1=null;
            System.out.println(nombreLenght(n1));
        }
        catch (NullPointerException e){
            System.err.println("Campo nombre vacío:"+e);
        }

        //solo con clase propia
        try{
            String n1=null;
            System.out.println(nombreLenghtExcepcionPropia(n1));
        }
        catch (StringNuloExcepcion e){
            System.err.println("Campo nombre vacío (CLASE PROPIA) :"+e);
        }
    }
}
