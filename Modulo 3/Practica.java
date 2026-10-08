import java.util.Locale;
import java.util.Scanner;

public class Practica {
    public static void main(String[] args) {
         Locale.setDefault(Locale.US);

        // Constante IVA
        final double porcentaje = 0.21;

        // Nombre 
       Scanner sc = new Scanner(System.in);
        System.out.print("Cual es tu nombre: ");
        String nombre = sc.nextLine();

        // Seccion del producto
        System.out.print("Cual es tu seccion del producto: ");
        char seccion = sc.nextLine().charAt(0);

        // Numero del articulos
        System.out.print("El numero de productos: ");
        int numeroProducto = sc.nextInt();

        // Precio del producto
        System.out.print("El precio de producto: ");
        double precioProducto = sc.nextDouble();

        // lista del producto//
        System.out.println("Nombre: " + nombre + " | Seccion: " + seccion);
       
        // Calculo del subtotal 
        double subtotal = numeroProducto * precioProducto;
        System.out.println("Subtotal: " + subtotal);

        //Total con IVA 
        double total = subtotal + (subtotal * porcentaje);
        System.out.println("Total con IVA: " + total);

        //Descuento aplicable
        boolean descuentoAplicable = subtotal > 100;
        System.out.println("Descuento aplicable: " + descuentoAplicable);

        // Puntos de acumulacion 
        int puntosAcumulados = (int) total; 
        System.out.println("Puntos acumulados: " + puntosAcumulados);

        sc.close();
    }
}
