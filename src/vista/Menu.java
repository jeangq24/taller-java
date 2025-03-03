package vista;

import modelo.Empleado;
import modelo.EmpleadoPorHoras;
import modelo.EmpleadoTiempoCompleto;
import modelo.gestion.GestorEmpleados;

import java.util.Scanner;

public class Menu {
    private static Scanner sc = new Scanner(System.in);

    public static void iniciar() {
        boolean salir = false;
        while (!salir) {
            mostrarOpciones();
            int opcion = ValidacionEntradas.validarEntero("Selecciona una opcion: ");
            switch (opcion) {
                case 1 -> registrarEmpleado();
                case 2 -> mostrarEmpleados();
                case 3 -> Reportes.mostrarReporte();
                case 4 -> salir = true;
                default -> System.out.println("Opcion no valida, intente nuevamente:");
            }
        }
        System.out.println("Saliendo del sistema...");
        sc.close();
    }

    public static void mostrarOpciones () {
        System.out.println("\n=== MENÚ PRINCIPAL ===");
        System.out.println("1. Registrar Empleado");
        System.out.println("2. Mostrar Empleados");
        System.out.println("3. Reportes");
        System.out.println("4. Salir");
    }

    public  static  void registrarEmpleado () {
        System.out.println("Ingrese el nombre del empleado:");
        String nombreEmpleado = sc.nextLine();
        Double sueldoBase = null;
        int opcionSueldoBase=0;
        while (opcionSueldoBase != 2 && opcionSueldoBase != 1) {
           opcionSueldoBase = ValidacionEntradas.validarEntero("¿Desea ajustar un sueldo base?: \n1. No. (por defecto $1.000) \n2. Si.");
        }
        if(opcionSueldoBase == 2) {
            sueldoBase = ValidacionEntradas.validarDecimal("Ingrese el sueldo base:");
        }

        int tipoEmpleado = 0;

        while (tipoEmpleado != 1 && tipoEmpleado != 2) {
            tipoEmpleado =  ValidacionEntradas.validarEntero("Ingrese el tipo de empleado: \n1. Tiempo completo \n2. Por horas");
        }

        Empleado empleado = switch (tipoEmpleado) {
            case 1 -> {
                int porcentajeBono = ValidacionEntradas.validarEntero("Ingrese un porcentaje de bono para el empleado:");
                yield new EmpleadoTiempoCompleto(nombreEmpleado, sueldoBase == null ? 1000 : sueldoBase, porcentajeBono);
            }

            case 2 -> {
                int cantidadHoras =  ValidacionEntradas.validarEntero("Ingrese la cantidad de horas trabajadas por el empleado:");
                yield new EmpleadoPorHoras(nombreEmpleado, sueldoBase == null ? 1000 : sueldoBase, cantidadHoras);
            }

            default -> {
                System.out.println("Opcion no valida");
                yield null;
            }
        };

        if(empleado != null) {
            GestorEmpleados.setEmpleado(empleado);
            System.out.println("Empleado registrado con exito");
        }
    }

    public static void mostrarEmpleados () {
        System.out.println("Lista de empleados registrados: ");
        GestorEmpleados.getEmpleados().forEach(empleado ->
                System.out.println("Nombre: " + empleado.getNombre() + "\n" + "Salario: " + empleado.calcularSalario() + "\n\n" ));
    }
}
