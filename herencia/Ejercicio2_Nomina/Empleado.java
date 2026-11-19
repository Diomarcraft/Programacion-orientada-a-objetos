public class Empleado {
    protected String nombre;
    protected String documento;
    protected double salarioBase;

    public Empleado(String nombre, String documento, double salarioBase) {
        this.nombre = nombre;
        this.documento = documento;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    // Definido solo en el padre: usa la version de calcularSalario() de cada hija
    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Salario a pagar: $" + String.format("%,.0f", calcularSalario()));
    }
}
