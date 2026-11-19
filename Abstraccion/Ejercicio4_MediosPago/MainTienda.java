package Abstraccion.Ejercicio4_MediosPago;

public class MainTienda {
    public static void main(String[] args) {
        MedioPago[] medios = {
            new TarjetaCredito(250000, "4111-2222-3333-4444"),
            new PagoEfectivo(80000),
            new PagoPSE(125000, "Banco de Bogota")
        };

        for (MedioPago medio : medios) {
            medio.mostrarMonto();
            medio.procesarPago();
            System.out.println("---");
        }
    }
}
