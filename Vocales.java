public class Vocales {
   public static void main(String[] args) {
       String frase= "Ayerme compré muñecos de la marca ‘ToyCo’ por internet.";
       int contador=0;
        for(int i = 0; frase.length() > i; i++){
            if(frase.charAt(i)=='a' || frase.charAt(i)=='e' || frase.charAt(i)=='i' || frase.charAt(i)=='o' || frase.charAt(i)=='u'
                    || frase.charAt(i)=='A' || frase.charAt(i)=='E' || frase.charAt(i)=='I' || frase.charAt(i)=='O' || frase.charAt(i)=='U' ){
                    contador+=1;
            }
        }
       System.out.println("Cantidad de vocales: "+contador);
   }
}
