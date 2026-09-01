package edu.uees.tutorias.factory;

public interface Notificador {
    void enviarNotificacion(String destinatario, String asunto, String cuerpo);
}