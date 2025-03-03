package modelo;

public class EmpleadoTiempoCompleto extends Empleado implements Bonificacion {
    private int porcentajeBono;

    public EmpleadoTiempoCompleto(String nombre, double sueldoBase, int porcentajeBono) {
        super(nombre, sueldoBase);
        this.porcentajeBono = porcentajeBono;

    }

    public EmpleadoTiempoCompleto(String nombre, int porcentajeBono) {
        super(nombre);
        this.porcentajeBono = porcentajeBono;

    }

    public int getPorcentajeBono() {
        return this.porcentajeBono;
    }

    public void setPorcentajeBono(int nuevoPorcentajeBono) {
        this.porcentajeBono = nuevoPorcentajeBono;
    }

    @Override
    public double calcularBonificacion () {
        return (super.getSueldoBase()*porcentajeBono)/100;
    }

    @Override
    public double calcularSalario () {
        return super.getSueldoBase() + calcularBonificacion();
    }
}
