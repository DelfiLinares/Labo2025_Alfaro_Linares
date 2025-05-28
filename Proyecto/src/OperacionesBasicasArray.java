import general.Persona;

import java.util.ArrayList;

public class OperacionesBasicasArray {
    public static void main (String [] args) {
        int resultado=0;
        ArrayList<Integer> numEnteros = new ArrayList<Integer>();//1
        numEnteros.add(3);
        numEnteros.add(4);
        numEnteros.add(5);
        numEnteros.add(6);
        for(int numero:numEnteros){
            resultado+=numero;
        }
        System.out.println("Resultado= "+resultado);
        System.out.println("----------------------");

        ArrayList<String> palabras=new ArrayList <String>();//2
        palabras.add("Zanahoria");
        palabras.add("Tomate");
        palabras.add("Batata");
        palabras.add("Arándano");
        palabras.add("Frutilla");
        char letra='A';
        for(String palabrita:palabras){
            char l=palabrita.charAt(0);
            if(l==letra){
                System.out.println("Palabras que empiezan con A: "+palabrita);
            }


        } System.out.println("----------------------");

        ArrayList <Persona> personas= new ArrayList <Persona>();
        personas.add(new Persona());
        personas.add(new Persona("Juan","Devoto",14));
        personas.add(new Persona("Abril","Pueyrredon",88));
        personas.add(new Persona("Lorenzo","Urquiza",16));
        personas.add(new Persona("Marta","Saavedra",25));
        personas.add(new Persona("Mirko","Devoto",19));

        int edadMax = 30;
        for (Persona personita:personas){
            int edad = personita.getEdad();
            if(edad>edadMax){
                personita.Imprimir();
            }
        }
    }
}

