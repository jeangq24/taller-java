package modelo.gestion;

import modelo.Empleado;
import java.util.ArrayList;
import java.util.List;

public class GestorEmpleados {
    private static List<Empleado> empleados = new ArrayList<>();

    public static void setEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    public static List<Empleado> getEmpleados(){
        return empleados;
    }

    public static int getTotalEmpleados(){
        return empleados.size();
    }

    public static double getTotalSalario(){
        return empleados.stream()
                .mapToDouble(Empleado::calcularSalario)
                .sum();
    }
}
