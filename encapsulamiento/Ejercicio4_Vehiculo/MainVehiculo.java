package encapsulamiento.Ejercicio4_Vehiculo;

public class MainVehiculo {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("ABC123", "Renault", "Logan");

        System.out.println("Vehiculo: " + v.getMarca() + " " + v.getModelo());

        v.acelerar(); // 10 km/h -> +0.1 km
        v.acelerar(); // 20 km/h -> +0.2 km
        v.acelerar(); // 30 km/h -> +0.3 km
        v.frenar();

        System.out.println("Velocidad final: " + v.getVelocidad() + " km/h");

        // ===== RETO: kilometraje y reset =====
        System.out.printf("Kilometraje total: %.2f km%n", v.getKilometrajeTotal()); // 0.60 km
        v.reset();
        System.out.println("Velocidad despues del reset: " + v.getVelocidad() + " km/h");
        System.out.printf("Kilometraje se conserva: %.2f km%n", v.getKilometrajeTotal());
    }
}
