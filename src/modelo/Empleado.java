package modelo;

public abstract class Empleado implements CalculaSalario {
    private int id=0;
    private String nombre;
    private double sueldoBase;
    protected static int contadorEmpleado=0;

    public Empleado(String nombre, double sueldoBase) {
        incrementarContadorEmpleado();
        this.id = contadorEmpleado;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;

    }

    public Empleado(String nombre) {
        incrementarContadorEmpleado();
        this.id = contadorEmpleado;
        this.nombre = nombre;
        this.sueldoBase = 1000;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public int getIdEmpleado() {
        return this.id;
    }

    public double getSueldoBase() {
        return this.sueldoBase;
    }

    public void setSueldoBase(double nuevoSueldoBase){
        this.sueldoBase = nuevoSueldoBase;
    }

    private static void incrementarContadorEmpleado() {
        contadorEmpleado++;
    }

    @Override
    public abstract double calcularSalario();
}
