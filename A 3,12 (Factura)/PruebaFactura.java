import java.util.Scanner;

public class PruebaFactura {
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("=== PRUEBA DE LA CLASE FACTURA ===");

    System.out.print("Ingrese el número de pieza: ");
    String numero = scanner.nextLine();

    System.out.print("Ingrese la descripción de la pieza: ");
    String descripcion = scanner.nextLine();

    System.out.print("Ingrese la cantidad de artículos: ");
    int cantidad = scanner.nextInt();

    System.out.print("Ingrese el precio por artículo: ");
    double precio = scanner.nextDouble();

    // Se rear una instancia del objeto Factura
    Factura miFactura = new Factura(numero, descripcion, cantidad, precio);