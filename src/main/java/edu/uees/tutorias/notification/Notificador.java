package edu.uees.tutorias.notification;

public interface Notificador {
    void enviarNotificacion(String destinatario, String asunto, String cuerpo);
}