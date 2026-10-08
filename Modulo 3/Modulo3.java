import java.util.Scanner;
public class Modulo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Introduzca su edad: ");
        int edad = input.nextInt();

        /* Determinar la categoría de la persona según su edad */
        if (edad >= 65) {
            System.out.println("Usted esta jubilado");
        } else if (edad >= 18) {
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Usted es menor de edad");
        }
    }
}

