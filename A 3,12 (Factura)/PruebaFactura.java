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