package herencia.RetoIntegrador_IPS;

public class MainIPS {
    public static void main(String[] args) {
        Medico medico = new Medico("1090123456", "Andres Gomez", 6000000,
                                   "Medicina General", 20);
        Enfermero enfermero = new Enfermero("1090654321", "Sofia Ramirez", 2500000, "noche");
        Administrativo administrativo = new Administrativo("1090987654", "Julian Pardo",
                                                           1800000, "facturacion");

        medico.registrarAsistencia();
        enfermero.registrarAsistencia();
        administrativo.registrarAsistencia();

        System.out.println();
        System.out.println("===== Personal de la IPS =====");
        medico.mostrarInfo();
        System.out.println("---");
        enfermero.mostrarInfo();
        System.out.println("---");
        administrativo.mostrarInfo();
    }
}
