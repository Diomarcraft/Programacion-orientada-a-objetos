package encapsulamiento.RetoIntegrador_IPS;

public class MainIPS {
    public static void main(String[] args) {
        // 1. Crear un paciente
        Paciente p = new Paciente("1090456789", "Maria Fernanda Rojas", 34, "O+");

        // Pruebas de validacion de los setters
        System.out.println("--- Validaciones ---");
        p.setEdad(150);         // Invalida
        p.setTipoSangre("C+");  // Invalido
        p.setTipoSangre("ab-"); // Valido (se normaliza a AB-)

        // El medico registra un diagnostico
        System.out.println("\n--- Registro de diagnostico ---");
        p.actualizarDiagnostico("clave-falsa", "Intento no autorizado"); // Rechazado
        p.actualizarDiagnostico("MED-2026", "Hipertension arterial controlada");

        // 2. Intentar consultar el diagnostico con una clave incorrecta
        System.out.println("\n--- Consulta con clave incorrecta ---");
        String d1 = p.consultarDiagnostico("1234");
        System.out.println("Resultado: " + (d1 == null ? "sin acceso" : d1));

        // 3. Consultar con la clave correcta
        System.out.println("\n--- Consulta con clave correcta ---");
        String d2 = p.consultarDiagnostico("MED-2026");
        System.out.println("Diagnostico: " + d2);

        // 4. Agregar 2 alergias
        System.out.println("\n--- Alergias ---");
        System.out.println("Tiene alergias? " + (p.tieneAlergias() ? "Si" : "No"));
        p.agregarAlergia("Penicilina");
        p.agregarAlergia("Mani");
        p.agregarAlergia("penicilina"); // Duplicada, se rechaza
        System.out.println("Tiene alergias? " + (p.tieneAlergias() ? "Si" : "No"));

        // 5. Mostrar toda la informacion publica
        System.out.println();
        p.mostrarInformacionPublica();
    }
}
