package edu.uees.tutorias.factory;

import edu.uees.tutorias.notification.Notificador;
import edu.uees.tutorias.notification.NotificadorEmail;

public class EmailCreator extends NotificadorCreator {
    @Override
    protected Notificador crearNotificador() {
        return new NotificadorEmail();
    }
}
