package edu.uees.tutorias.factory;

public class NotificadorSms implements Notificador {
    @Override
    public void enviarNotificacion(String destinatario, String asunto, String cuerpo) {
        System.out.println("[NOTIFICACION SMS]");
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Asunto: " + asunto);
        System.out.println("Cuerpo: " + cuerpo);
    }
}
