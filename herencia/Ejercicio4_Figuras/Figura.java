public class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public double calcularArea() {
        return 0; // Sera sobrescrito por las hijas
    }

    public String getColor() {
        return color;
    }

    // Reto extra: muestra el color y el area usando la version de cada hija
    public void describir() {
        System.out.println(getClass().getSimpleName() + " " + color
                + " - Area: " + String.format("%.2f", calcularArea()));
    }
}
