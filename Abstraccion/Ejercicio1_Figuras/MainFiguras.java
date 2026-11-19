public class MainFiguras {
    public static void main(String[] args) {
        Figura[] figuras = {
            new Circulo(5),
            new Triangulo(4, 6),
            new Rectangulo(4, 3)
        };

        for (Figura figura : figuras) {
            figura.mostrar();
            System.out.println("---");
        }
    }
}
