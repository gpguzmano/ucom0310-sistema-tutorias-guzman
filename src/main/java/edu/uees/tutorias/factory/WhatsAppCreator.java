package edu.uees.tutorias.factory;

import edu.uees.tutorias.notification.Notificador;
import edu.uees.tutorias.notification.NotificadorWhatsApp;

public class WhatsAppCreator extends NotificadorCreator {
    @Override
    protected Notificador crearNotificador() {
        return new NotificadorWhatsApp();
    }
}
