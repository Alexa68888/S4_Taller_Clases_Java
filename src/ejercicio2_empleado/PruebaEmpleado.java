package ejercicio2_empleado;

import javax.swing.JOptionPane; // Importamos la librería para las ventanas

public class PruebaEmpleado {
    public static void main(String[] args) {

        // --- EMPLEADO 1 ---
        String nombre1 = JOptionPane.showInputDialog("Empleado 1 - Ingrese el primer nombre:");
        String apellido1 = JOptionPane.showInputDialog("Empleado 1 - Ingrese el apellido:");
        double salario1 = Double.parseDouble(JOptionPane.showInputDialog("Empleado 1 - Ingrese el salario mensual:"));

        Empleado emp1 = new Empleado(nombre1, apellido1, salario1);

        // --- EMPLEADO 2 ---
        String nombre2 = JOptionPane.showInputDialog("Empleado 2 - Ingrese el primer nombre:");
        String apellido2 = JOptionPane.showInputDialog("Empleado 2 - Ingrese el apellido:");
        double salario2 = Double.parseDouble(JOptionPane.showInputDialog("Empleado 2 - Ingrese el salario mensual:"));

        Empleado emp2 = new Empleado(nombre2, apellido2, salario2);

        // --- MOSTRAR SALARIOS ANUALES INICIALES ---
        String mensaje = "--- SALARIOS ANUALES INICIALES ---\n";
        mensaje += emp1.getPrimerNombre() + " " + emp1.getApellidoPaterno() + ": $" + emp1.calcularSalarioAnual() + "\n";
        mensaje += emp2.getPrimerNombre() + " " + emp2.getApellidoPaterno() + ": $" + emp2.calcularSalarioAnual() + "\n\n";

        // --- APLICAR AUMENTO DEL 10% ---
        // Multiplicamos el salario actual por 1.10
        emp1.setSalarioMensual(emp1.getSalarioMensual() * 1.10);
        emp2.setSalarioMensual(emp2.getSalarioMensual() * 1.10);

        // --- MOSTRAR SALARIOS ANUALES CON AUMENTO ---
        mensaje += "--- SALARIOS ANUALES CON AUMENTO DEL 10% ---\n";
        mensaje += emp1.getPrimerNombre() + " " + emp1.getApellidoPaterno() + ": $" + emp1.calcularSalarioAnual() + "\n";
        mensaje += emp2.getPrimerNombre() + " " + emp2.getApellidoPaterno() + ": $" + emp2.calcularSalarioAnual();

        // Mostrar todo en una ventana final
        JOptionPane.showMessageDialog(null, mensaje);
    }
}