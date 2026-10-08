import java.util.Scanner;
public class Modulo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("intoduzca su edad: ");
        int edad = input.nextInt();
        
        if (edad >= 65) {
            System.out.println("Eres jubilado");
        } else if (edad >= 18) {
            System.out.println("Eres adulto");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}

