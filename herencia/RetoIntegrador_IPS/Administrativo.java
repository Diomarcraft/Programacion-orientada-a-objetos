package herencia.RetoIntegrador_IPS;

public class Administrativo extends PersonalIPS {
    private String area; // recepcion, facturacion, etc.

    public Administrativo(String documento, String nombre, double salarioBase, String area) {
        super(documento, nombre, salarioBase);
        this.area = area;
    }

    @Override
    public double calcularSalarioMensual() {
        return salarioBase; // Gana solo el salario base
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Cargo: Administrativo - Area de " + area);
        super.mostrarInfo();
    }
}
