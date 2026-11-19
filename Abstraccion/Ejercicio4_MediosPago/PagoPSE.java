public class PagoPSE extends MedioPago {
    private String banco;

    public PagoPSE(double monto, String banco) {
        super(monto);
        this.banco = banco;
    }

    @Override
    public void procesarPago() {
        System.out.println("Redirigiendo al banco " + banco + "...");
        System.out.println("Esperando confirmacion del banco...");
        System.out.println("Pago aprobado por PSE por $" + monto);
    }
}
