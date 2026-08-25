package edu.uees.tutorias.usecase;

public interface Notificador {
    void enviarNotificacion(String destinatario, String asunto, String cuerpo);
}