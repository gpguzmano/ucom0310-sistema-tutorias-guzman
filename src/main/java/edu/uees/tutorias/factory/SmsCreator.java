package edu.uees.tutorias.factory;

import edu.uees.tutorias.notification.Notificador;
import edu.uees.tutorias.notification.NotificadorSms;

public class SmsCreator extends NotificadorCreator {
    @Override
    protected Notificador crearNotificador() {
        return new NotificadorSms();
    }
}
