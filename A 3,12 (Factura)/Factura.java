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