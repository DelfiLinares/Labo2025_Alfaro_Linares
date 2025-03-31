import java.util.Scanner;

public class DiaLaboral {
    public static void main(String[] args) {
        System.out.println("Ingresar día");
        Scanner e = new Scanner(System.in);
        String dia = e.nextLine();

        switch (dia) {
            case "Lunes":
                System.out.println("Dia laboral");
                break;
            case "Martes":
                System.out.println("Dia laboral");
                break;
            case "Miercoles":
                System.out.println("Dia laboral");
                break;
            case "Jueves":
                System.out.println("Dia laboral");
                break;
            case "Viernes":
                System.out.println("Dia laboral");
                break;
            case "Sabado":
                System.out.println("No es dia laboral");
                break;
            case "Domingo":
                System.out.println("No es dia laboral");
                break;
        }
    }
}