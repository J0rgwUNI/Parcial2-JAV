// Version: 1.0
/*
 * Clase que representa una gestion de empleados. 
 * Esta clase permite aumentar el salario de todos los empleados en un porcentaje dado.
 */
public class SistemaGestionEmpleados {
    //creamos arreglo de empleados
    private Empleado[] empleados;
    //constructor de la clase
    public SistemaGestionEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }
    //metodo que aumenta el salario de los empleados
    public void aumentarSalario(double porcentaje) {
        double nuevoSalario=0.0;
        for (Empleado empleado : empleados) {
            nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }
}
    