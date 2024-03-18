// Version: 1.0
/*
 * Clase que representa una gestion de empleados. 
 * Esta clase permite aumentar el salario de todos los empleados en un porcentaje dado.
 */
public class SistemaGestionEmpleados {
    //creamos arreglo de empleados
    private Empleado[] empleados;
    /**
     * constructor de la clase
     * @param empleados The array of employees
     */
    public SistemaGestionEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }
    /**
     * metodo que aumenta el salario de los empleados
     *
     * @param porcentaje el porcentaje a aumentar en la clase.
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : empleados) {
            empleado.aumentarSalario(porcentaje);
        }
    }
}
    