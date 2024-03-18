// Version: 1.0
/*
 * Clase que representa una gestion de empleados. 
 * 
 * 
 * 
 */
public class SistemaGestionEmpleados {

    private Empleado[] empleados;

    public SistemaGestionEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public void aumentarSalario(double porcentaje) {
        double nuevoSalario=0.0;
        for (Empleado empleado : empleados) {
            nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }
}
    