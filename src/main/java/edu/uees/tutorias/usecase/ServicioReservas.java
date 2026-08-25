package edu.uees.tutorias.usecase;

import edu.uees.tutorias.domain.Estudiante;
import edu.uees.tutorias.domain.HorarioTutoria;
import edu.uees.tutorias.domain.Reserva;

public class ServicioReservas {
    private final RepositorioReservas repositorioReservas;
    private final Notificador notificador;

    public ServicioReservas(RepositorioReservas repositorioReservas, Notificador notificador) {
        this.repositorioReservas = repositorioReservas;
        this.notificador = notificador;
    }

    public Reserva crearReserva(String idReserva, Estudiante estudiante, HorarioTutoria horario) {
        Reserva nuevaReserva = new Reserva(idReserva, estudiante, horario);
        repositorioReservas.guardar(nuevaReserva);

        notificador.enviarNotificacion(
                horario.getDocente().getCorreo(),
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

        notificador.enviarNotificacion(
                reserva.getHorario().getDocente().getCorreo(),
                "Tutoría Cancelada",
                "La reserva del estudiante " + reserva.getEstudiante().getNombre() + " ha sido cancelada."
        );
    }
}