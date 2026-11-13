public class MainUsuario {
    public static void main(String[] args) {
        Usuario u = new Usuario("carlos.dev", "clave1234");

        System.out.println("Usuario: " + u.getNombreUsuario());

        u.cambiarPassword("hola"); // Invalida
        System.out.println("Login OK? " + u.verificarPassword("clave1234"));
        System.out.println("Login mal? " + u.verificarPassword("otra"));

        u.cambiarPassword("nuevaClave9");
        System.out.println("Login nuevo? " + u.verificarPassword("nuevaClave9"));

        // ===== RETO: bloqueo tras 3 intentos fallidos =====
        System.out.println("\n--- Simulando 3 intentos fallidos ---");
        System.out.println("Login? " + u.verificarPassword("error1"));
        System.out.println("Login? " + u.verificarPassword("error2"));
        System.out.println("Login? " + u.verificarPassword("error3"));

        System.out.println("Bloqueado? " + (u.isBloqueado() ? "Si" : "No"));
        // Aunque ahora escriba la clave correcta, debe devolver false
        System.out.println("Login con clave correcta? " + u.verificarPassword("nuevaClave9"));
    }
}
