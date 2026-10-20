package ejercicio2_empleado;

public class Empleado {
    // 1. Atributos privados
    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    // 2. Constructor
    public Empleado(String primerNombre, String apellidoPaterno, double salarioMensual) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        setSalarioMensual(salarioMensual); // Usamos el setter para que aplique la validación
    }

    // 3. Getters y Setters
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

    // VALIDACIÓN CLAVE: Si el salario no es positivo, NO se actualiza.
    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0.0) {
            this.salarioMensual = salarioMensual;
        }
    }

    // 4. Método de cálculo
    public double calcularSalarioAnual() {
        return salarioMensual * 12;
    }
}