package vista;

import java.util.Scanner;

public class ValidacionEntradas {

    private static Scanner sc = new Scanner(System.in);

    public static int validarEntero (String mensaje) {

        while (true) {
            System.out.println(mensaje);
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opcion no valida. Por favor, intente nuevamente.");
            }
        }
    }

    public static double validarDecimal (String mensaje) {

        while (true) {
            System.out.println(mensaje);
            try {
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opcion no valida. Por favor, intente nuevamente.");
            }
        }
    }
}
