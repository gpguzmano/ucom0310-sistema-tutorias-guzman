package edu.uees.tutorias.infrastructure;

import edu.uees.tutorias.usecase.Notificador;

public class ServicioWhatsApp implements Notificador {

    @Override
    public void enviarNotificacion(String destinatario, String asunto, String cuerpo) {
        throw new UnsupportedOperationException("No implementado aún (Esqueleto inicial del proyecto).");
    }
}
