public class Empleado {
    // Atributos privados
    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    // Constructor
    public Empleado(String primerNombre, String apellidoPaterno, double salarioMensual) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        setSalarioMensual(salarioMensual);
    }

    // Getters y Setters
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    // VALIDACIÓN: Si el salario no es positivo, NO se actualiza
    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0.0) {
            this.salarioMensual = salarioMensual;
        }
    }

    // Método de cálculo
    public double calcularSalarioAnual() {
        return salarioMensual * 12;
    }
}