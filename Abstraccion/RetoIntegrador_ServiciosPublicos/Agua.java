public class Agua extends ServicioPublico {
    public Agua(String numeroContrato, String titular, double consumo) {
        super(numeroContrato, titular, consumo);
    }

    @Override
    public double calcularFactura() {
        return consumo * 3500 + 8000;
    }
}
