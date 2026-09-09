package edu.uees.tutorias.observer;

import edu.uees.tutorias.domain.Reserva;
import edu.uees.tutorias.notification.Notificador;

public class ObservadorNotificador implements ObservadorReserva {
    private final Notificador notificador;

    public ObservadorNotificador(Notificador notificador) {
        if (notificador == null) {
            throw new IllegalArgumentException("El notificador es obligatorio.");
        }

        this.notificador = notificador;
    }

    @Override
    public void actualizar(Reserva reserva, String evento) {
        if (reserva == null) {
            throw new IllegalArgumentException("El reserva es obligatoria.");
        }

        if (evento == null || evento.isBlank()) {
            throw new IllegalArgumentException("El evento es obligatoria.");
        }

        notificador.enviarNotificacion(reserva.getEstudiante().getCorreo(),
                "Notificación por observador",
                evento);
    }
}
