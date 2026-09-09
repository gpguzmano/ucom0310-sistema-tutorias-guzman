package edu.uees.tutorias.factory;

import edu.uees.tutorias.notification.Notificador;

public abstract class NotificadorCreator {
    protected abstract Notificador crearNotificador();

    public void notificar(String destino, String asunto, String cuerpo) {
        Notificador notificador = crearNotificador();
        notificador.enviarNotificacion(destino, asunto, cuerpo);
    }
}
