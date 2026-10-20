public class Factura {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    // Constructor que inicializa las cuatro variables
    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        establecerCantidad(cantidad);
        establecerPrecioPorArticulo(precioPorArticulo);
}
    // Métodos establecer y obtener para número de pieza
    public void establecerNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }
    public String obtenerNumeroPieza() {
        return numeroPieza;
    }
    // Métodos establecer y obtener para descripción de pieza
    public void establecerDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }
    public String obtenerDescripcionPieza() {
        return descripcionPieza;
    }

    // Métodos establecer y obtener para cantidad (con validación)
    public void establecerCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0; // Si no es positivo, se establece en 0
        }
    }
    public int obtenerCantidad() {
        return cantidad;
    }
