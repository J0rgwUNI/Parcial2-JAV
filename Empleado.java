// Version: 1.0
/**
 * Clase que representa un empleado.
 * */
class Empleado {
    private String nombre;
    private String cargo;
    private double salario;
    /**
     * Constructor de la clase Empleado
     * @param nombre
     * @param cargo
     * @param salario
     */
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }
    /**
     * Devuelve el nombre del empleado.
     * @return nombvre del empleado
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Devuelve el cargo del empleado.
     * @return cargo del empleado
     */
    public String getCargo() {
        return cargo;
    }
    /**
     * Devuelve el salario del empleado.
     * @return salario del empleado
     */
    public double getSalario() {
        return salario;
    }
    /**
     * Establece el nombre del empleado.
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Establece el cargo del empleado.
     * @param cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    /**
     * Establece el salario del empleado.
     * @param salario
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    /**
     * Increases the salary of the employee by the given percentage.
     *
     * @param porcentaje The percentage increase in salary.
     */
    public void aumentarSalario(double porcentaje) {
        salario *= (1 + porcentaje / 100);
    }
    /**
     * Devuelve un string con los datos de empleados.
     *
     * @return devuelve el string de datos de empleados.
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
