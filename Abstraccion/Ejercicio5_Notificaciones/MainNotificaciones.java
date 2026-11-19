public class MainNotificaciones {
    public static void main(String[] args) {
        Notificacion[] notificaciones = {
            new NotificacionEmail("carlos@sena.edu.co", "Su matricula fue aprobada."),
            new NotificacionSMS("3001234567", "Su pedido esta en camino."),
            new NotificacionWhatsApp("3007654321", "Su cita fue confirmada.")
        };

        for (Notificacion notificacion : notificaciones) {
            notificacion.enviar();
            System.out.println("---");
        }
    }
}
