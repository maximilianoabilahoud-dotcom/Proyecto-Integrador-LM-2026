import java.util.Scanner;

public class Practica {
    public static void main(String[] args) {
        // Constante IVA
        final double porcentaje = 0.21;

        // Nombre 
       Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        // Seccion del producto
        System.out.print("Cual es tu seccion: ");
        char seccion = sc.nextLine().charAt(0);

        // Numero del articulos
        System.out.print("Ingrese el numero de articulos: ");
        int numeroProducto = sc.nextInt();

        // Precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = sc.nextDouble();

        // lista del producto//
        System.out.println("Nombre: " + nombre + "/ Seccion: " + seccion);
        // Calculo del subtotal 
        double subtotal = numeroProducto * precioProducto;
        System.out.println("Subtotal: " + subtotal);

        //Total con IVA 
        double total = subtotal + (subtotal * porcentaje);
        System.out.println("Total con IVA: " + total);
         



       
        

        sc.close();
    }
}
