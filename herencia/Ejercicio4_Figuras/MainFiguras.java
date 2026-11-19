package herencia.Ejercicio4_Figuras;

public class MainFiguras {
    public static void main(String[] args) {
        Circulo c = new Circulo("Rojo", 5);
        Rectangulo r = new Rectangulo("Azul", 4, 6);
        Triangulo t = new Triangulo("Verde", 3, 8);

        System.out.println("Circulo " + c.getColor() +
                           " - Area: " + c.calcularArea());
        System.out.println("Rectangulo " + r.getColor() +
                           " - Area: " + r.calcularArea());
        System.out.println("Triangulo " + t.getColor() +
                           " - Area: " + t.calcularArea()); // RETO

        // ===== Reto extra: describir() definido en el padre =====
        System.out.println();
        System.out.println("--- Usando describir() ---");
        c.describir();
        r.describir();
        t.describir();
    }
}
