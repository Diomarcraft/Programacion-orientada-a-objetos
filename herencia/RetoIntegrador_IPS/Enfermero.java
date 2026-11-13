public class Enfermero extends PersonalIPS {
    private static final double RECARGO_NOCTURNO = 200000;

    private String turno; // manana, tarde o noche

    public Enfermero(String documento, String nombre, double salarioBase, String turno) {
        super(documento, nombre, salarioBase);
        this.turno = turno;
    }

    @Override
    public double calcularSalarioMensual() {
        if ("noche".equalsIgnoreCase(turno)) {
            return salarioBase + RECARGO_NOCTURNO;
        }
        return salarioBase;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Cargo: Enfermero - Turno " + turno);
        super.mostrarInfo();
    }
}
