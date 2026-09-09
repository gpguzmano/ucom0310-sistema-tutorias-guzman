package edu.uees.tutorias.notification;

public class NotificadorEmail implements Notificador {

    @Override
    public void enviarNotificacion(String destinatario, String asunto, String cuerpo) {
        System.out.println("[NOTIFICACION EMAIL]");
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Asunto: " + asunto);
        System.out.println("Cuerpo: " + cuerpo);
    }
}