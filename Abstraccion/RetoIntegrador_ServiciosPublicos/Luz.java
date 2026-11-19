package Abstraccion.RetoIntegrador_ServiciosPublicos;

public class Luz extends ServicioPublico {
    public Luz(String numeroContrato, String titular, double consumo) {
        super(numeroContrato, titular, consumo);
    }

    @Override
    public double calcularFactura() {
        return consumo * 650 + 12000;
    }
}
