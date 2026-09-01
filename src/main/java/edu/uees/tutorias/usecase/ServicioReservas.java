package edu.uees.tutorias.usecase;

import edu.uees.tutorias.domain.Estudiante;
import edu.uees.tutorias.domain.HorarioTutoria;
import edu.uees.tutorias.domain.Reserva;
import edu.uees.tutorias.factory.*;

public class ServicioReservas {
    private final RepositorioReservas repositorioReservas;

    public ServicioReservas(RepositorioReservas repositorioReservas) {
        this.repositorioReservas = repositorioReservas;
    }

    public Reserva crearReserva(String idReserva, Estudiante estudiante, HorarioTutoria horario) {
        Reserva nuevaReserva = new Reserva(idReserva, estudiante, horario);
        repositorioReservas.guardar(nuevaReserva);

        NotificadorCreator emailCreator = new EmailCreator();
        emailCreator.notificar(
                horario.getDocente().getCorreo(),
                "Nueva Tutoría Solicitada",
                "El estudiante " + estudiante.getNombre() + " ha reservado el horario."
        );

        NotificadorCreator whatsAppCreator = new WhatsAppCreator();
        whatsAppCreator.notificar(
                horario.getDocente().getCelular(),
                "Nueva Tutoría Solicitada",
                "El estudiante " + estudiante.getNombre() + " ha reservado el horario."
        );

        NotificadorCreator smsCreator = new SmsCreator();
        smsCreator.notificar(
                horario.getDocente().getCelular(),
                "Nueva Tutoría Solicitada",
                "El estudiante " + estudiante.getNombre() + " ha reservado el horario."
        );

        return nuevaReserva;
    }

    public void cancelarReserva(String idReserva) {
        Reserva reserva = repositorioReservas.buscarPorId(idReserva)
                .orElseThrow(() -> new IllegalArgumentException("Reserva no encontrada con el ID: " + idReserva));

        reserva.cancelar();
        repositorioReservas.actualizar(reserva);

        NotificadorCreator emailCreator = new EmailCreator();
        emailCreator.notificar(
                reserva.getHorario().getDocente().getCorreo(),
                "Tutoría Cancelada",
                "La reserva del estudiante " + reserva.getEstudiante().getNombre() + " ha sido cancelada."
        );

        NotificadorCreator whatsAppCreator = new WhatsAppCreator();
        whatsAppCreator.notificar(
                reserva.getHorario().getDocente().getCelular(),
                "Tutoría Cancelada",
                "La reserva del estudiante " + reserva.getEstudiante().getNombre() + " ha sido cancelada."
        );

        NotificadorCreator smsCreator = new SmsCreator();
        smsCreator.notificar(
                reserva.getHorario().getDocente().getCelular(),
                "Tutoría Cancelada",
                "La reserva del estudiante " + reserva.getEstudiante().getNombre() + " ha sido cancelada."
        );
    }
}