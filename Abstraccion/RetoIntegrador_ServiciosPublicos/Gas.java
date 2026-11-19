package Abstraccion.RetoIntegrador_ServiciosPublicos;

public class Gas extends ServicioPublico {
    public Gas(String numeroContrato, String titular, double consumo) {
        super(numeroContrato, titular, consumo);
    }

    @Override
    public double calcularFactura() {
        return consumo * 2100 + 5000;
    }
}
