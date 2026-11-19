package herencia.Ejercicio5_Plataforma;

// RETO: tercera clase hija
public class Administrador extends Usuario {
    private String nivelPermiso; // "TOTAL" o "PARCIAL"

    public Administrador(String nombre, String correo, String nivelPermiso) {
        super(nombre, correo);
        // Cualquier valor distinto de TOTAL se toma como PARCIAL
        if (nivelPermiso != null && nivelPermiso.equalsIgnoreCase("TOTAL")) {
            this.nivelPermiso = "TOTAL";
        } else {
            this.nivelPermiso = "PARCIAL";
        }
    }

    @Override
    public void iniciarSesion() {
        super.iniciarSesion();
        System.out.println("Panel de administracion con permisos: " + nivelPermiso);
    }
}
