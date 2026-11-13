public class MainCuenta {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("001-2345", "Carlos Perez", 100000000);

        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo inicial: $" + cuenta.getSaldo());

        cuenta.depositar(500000);
        cuenta.retirar(150000);
        cuenta.retirar(200000000);// Debe fallar por saldo insuficiente

        System.out.println("Saldo final: $" + cuenta.getSaldo());

        // ===== RETO: transferencias entre dos cuentas =====
        System.out.println("\n--- Prueba de transferencias ---");
        CuentaBancaria cuenta2 = new CuentaBancaria("001-9876", "Ana Rojas");

        cuenta.transferir(cuenta2, 100000);   // Valida
        cuenta.transferir(cuenta2, -5000);    // Cantidad negativa
        cuenta.transferir(cuenta2, 500000000);  // Saldo insuficiente
        cuenta.transferir(cuenta, 1000);      // Misma cuenta
        cuenta.transferir(null, 1000);        // Destino inexistente

        System.out.println("Saldo " + cuenta.getTitular() + ": $" + cuenta.getSaldo());
        System.out.println("Saldo " + cuenta2.getTitular() + ": $" + cuenta2.getSaldo());
    }
}
