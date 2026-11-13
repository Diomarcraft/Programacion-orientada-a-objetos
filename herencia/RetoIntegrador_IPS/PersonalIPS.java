public class PersonalIPS {
    protected String documento;
    protected String nombre;
    protected double salarioBase;

    public PersonalIPS(String documento, String nombre, double salarioBase) {
        this.documento = documento;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Igual para todo el personal: no necesita sobrescribirse
    public void registrarAsistencia() {
        System.out.println(nombre + " registro su asistencia.");
    }

    // Cada hija lo sobrescribe con su propio calculo
    public double calcularSalarioMensual() {
        return salarioBase;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Salario base: $" + String.format("%,.0f", salarioBase));
        System.out.println("Salario mensual: $" + String.format("%,.0f", calcularSalarioMensual()));
    }
}
