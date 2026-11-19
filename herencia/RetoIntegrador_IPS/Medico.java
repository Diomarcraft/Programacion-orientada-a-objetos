package herencia.RetoIntegrador_IPS;

public class Medico extends PersonalIPS {
    private static final double PAGO_POR_CONSULTA = 500000;

    private String especialidad;
    private int consultasDelMes;

    public Medico(String documento, String nombre, double salarioBase,
                  String especialidad, int consultasDelMes) {
        super(documento, nombre, salarioBase);
        this.especialidad = especialidad;
        this.consultasDelMes = consultasDelMes;
    }

    @Override
    public double calcularSalarioMensual() {
        return salarioBase + (consultasDelMes * PAGO_POR_CONSULTA);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Cargo: Medico - " + especialidad
                + " (" + consultasDelMes + " consultas del mes)");
        super.mostrarInfo();
    }
}
