package mainExcepciones;

public class StringNuloExcepcion extends Exception{
    public StringNuloExcepcion(String msj){
        super(msj);
    }

    public static void ingresarNombre(String n) throws StringNuloExcepcion{
        if (n == null){
            throw new StringNuloExcepcion("El nombre está vacío.");
        }
        else {
            System.out.println("El nombre contiene: " + n.length() + " letras");
        }
    }

    public static void main(String[] args) {
        try{
            String n = null;
            ingresarNombre(n);
        }
        catch(StringNuloExcepcion e){
            e.printStackTrace();
            e.getMessage();
        }
    }
}
