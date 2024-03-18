//importamos la clase Scanner para poder leer datos del usuario
import java.util.Scanner;
//logica de la clase main que ejecuta el programa
public class Main {
    //creamos un arreglo de empleados
    private static Empleado[] empleados = {
        new Empleado("Juan", "Gerente", 1000),
        new Empleado("Pedro", "Jefe de Proyecto", 800),
        new Empleado("Maria", "Analista", 600),
        new Empleado("Luis", "Programador", 500)
    };
    //metodo main que ejecuta el programa    
    private static void listarEMP(Empleado[] empleados) {
        System.out.println(MagicStrings.LISTA_EMPLEADOS);
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }

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
