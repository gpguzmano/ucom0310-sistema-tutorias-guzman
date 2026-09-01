package edu.uees.tutorias.factory;

public class WhatsAppCreator extends NotificadorCreator {
    @Override
    protected Notificador crearNotificador() {
        return new NotificadorWhatsApp();
    }
}
