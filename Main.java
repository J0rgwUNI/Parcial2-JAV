//importamos la clase Scanner para poder leer datos del usuario
import java.util.Scanner;
/**
 * Esta clase representa un simple sistema de gestión de empleados.
 * Permite a los usuarios ingresar un aumento porcentual en los salarios
 * y muestra la lista actualizada de empleados con sus salarios aumentados.
 */
public class Main {
    /**
     * Empleado
     * Arreglo de empleados
     */
    private static Empleado[] empleados = {
        new Empleado("Juan", "Gerente", 1000),
        new Empleado("Pedro", "Jefe de Proyecto", 800),
        new Empleado("Maria", "Analista", 600),
        new Empleado("Luis", "Programador", 500)
    };
    /**
     * Metodo que imprime la lista de empleados
     * 
     *  */    
    private static void listarEMP(Empleado[] empleados) {
        System.out.println(MagicStrings.LISTA_EMPLEADOS);
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
    /**
     * el metodo main del programa
     * permite a los usuarios ingresar un aumento porcentual en los salarios
     * y muestra la lista actualizada de empleados con sus salarios aumentados.
     * @param args scanner recoge porcentaje a sumar en el salario
     */
    public static void main(String[] args) {

            //creamos el objeto de la clase SistemaGestionEmpleados
            SistemaGestionEmpleados sistema = new SistemaGestionEmpleados(empleados);
            //leemos el porcentaje de aumento de salario
            Scanner scanner = new Scanner(System.in);
            System.out.print(MagicStrings.PORCENTAJE_AUMENTO);
            double porcentaje = scanner.nextDouble();
            //aumentamos el salario de los empleados
            sistema.aumentarSalario(porcentaje);
            //imprimimos la lista de empleados
            listarEMP(empleados);
            //cerramos el scanner
            scanner.close();
        }
}
