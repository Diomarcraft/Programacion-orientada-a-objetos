package Abstraccion.RetoIntegrador_ServiciosPublicos;

public class MainServicios {
    public static void main(String[] args) {
        ServicioPublico[] servicios = {
            new Agua("A-1001", "Ana Rios", 15),
            new Luz("L-2002", "Luis Mora", 250),
            new Gas("G-3003", "Maria Leon", 12)
        };

        for (ServicioPublico servicio : servicios) {
            servicio.emitirRecibo();
            System.out.println("---");
        }
    }
}
