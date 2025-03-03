package vista;

import modelo.gestion.GestorEmpleados;

public class Reportes {
    public static void mostrarReporte() {
        System.out.println("\n=== REPORTES ===");
        System.out.println("Total empleados: " + GestorEmpleados.getTotalEmpleados());
        System.out.println("Total nomina: " + GestorEmpleados.getTotalSalario());
    }
}
