package edu.uees.tutorias.factory;

public class SmsCreator extends NotificadorCreator {
    @Override
    protected Notificador crearNotificador() {
        return new NotificadorSms();
    }
}
