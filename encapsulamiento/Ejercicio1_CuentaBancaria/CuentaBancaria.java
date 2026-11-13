public class CuentaBancaria {
    // Atributos privados - encapsulados
    private final String numeroCuenta;
    private final String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Constructor con saldo inicial
    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial > 0 ? saldoInicial : 0.0;
    }

    // Getters - solo lectura desde el exterior
    public String getNumeroCuenta() { return numeroCuenta; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Deposito exitoso de $" + cantidad);
        } else {
            System.out.println("Error: la cantidad debe ser positiva.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad debe ser positiva.");
        } else if (cantidad > saldo) {
            System.out.println("Error: saldo insuficiente.");
        } else {
            saldo -= cantidad;
            System.out.println("Retiro exitoso de $" + cantidad);
        }
    }

    // RETO: transferir dinero de esta cuenta a otra cuenta
    // Devuelve true si la transferencia se hizo, false si fue rechazada.
    public boolean transferir(CuentaBancaria destino, double cantidad) {
        if (destino == null) {
            System.out.println("Error: la cuenta destino no existe.");
            return false;
        }
        if (destino == this) {
            System.out.println("Error: no puede transferir a la misma cuenta.");
            return false;
        }
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad a transferir debe ser positiva.");
            return false;
        }
        if (cantidad > saldo) {
            System.out.println("Error: saldo insuficiente para transferir $" + cantidad);
            return false;
        }
        // Se valida TODO antes de mover el dinero, asi nunca queda a medias
        this.saldo -= cantidad;
        destino.saldo += cantidad; // permitido: estamos dentro de la misma clase
        System.out.println("Transferencia exitosa de $" + cantidad + " de "
                + this.titular + " a " + destino.getTitular());
        return true;
    }
}
