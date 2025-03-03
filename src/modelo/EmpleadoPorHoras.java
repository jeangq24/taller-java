package modelo;

public class EmpleadoPorHoras extends Empleado {
    private int cantidadHoras;


    public EmpleadoPorHoras(String nombre, double sueldoBase, int cantidadHoras) {
        super(nombre, sueldoBase);
        this.cantidadHoras = cantidadHoras;


    }

    public EmpleadoPorHoras(String nombre, int cantidadHoras) {
        super(nombre);
        this.cantidadHoras = cantidadHoras;
    }

    public int getCantidadHoras() {
        return this.cantidadHoras;
    }

    public void setCantidadHoras(int nuevaCantidadHoras) {
        this.cantidadHoras = nuevaCantidadHoras;
    }

    @Override
    public double calcularSalario(){
        //En base un sueldo base y 160 horas de trabajo de 1 mes.
        return (super.getSueldoBase()/160)*cantidadHoras;
    }
}
