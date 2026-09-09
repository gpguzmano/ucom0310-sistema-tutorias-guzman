package edu.uees.tutorias.service;

import edu.uees.tutorias.builder.ReservaBuilder;
import edu.uees.tutorias.domain.Estudiante;
import edu.uees.tutorias.domain.HorarioTutoria;
import edu.uees.tutorias.domain.Reserva;
import edu.uees.tutorias.factory.*;
import edu.uees.tutorias.notification.Notificador;
import edu.uees.tutorias.observer.ObservadorNotificador;
import edu.uees.tutorias.observer.ObservadorReserva;
import edu.uees.tutorias.repository.RepositorioReservas;
import edu.uees.tutorias.strategy.PoliticaCancelacion;
import edu.uees.tutorias.strategy.PoliticaCancelacionNormal;

import java.util.ArrayList;
import java.util.List;

public class ServicioReservas {
    private final RepositorioReservas repositorioReservas;
    private final PoliticaCancelacion politicaCancelacion;
    private final List<ObservadorReserva> observadores = new ArrayList<ObservadorReserva>();

    public ServicioReservas(RepositorioReservas repositorioReservas, Notificador notificador) {
        this(repositorioReservas,
                notificador,
                new PoliticaCancelacionNormal());
    }

    public ServicioReservas(RepositorioReservas repositorioReservas,
                            Notificador notificador,
                            PoliticaCancelacion politicaCancelacion) {
        if (repositorioReservas == null) {
            throw new IllegalArgumentException("El repositorio es obligatorio.");
        }

        if (notificador == null) {
            throw new IllegalArgumentException("El notificador es obligatorio.");
        }

        if (politicaCancelacion == null) {
            throw new IllegalArgumentException("El politica de cancelación es obligatorio.");
        }

        this.repositorioReservas = repositorioReservas;
        this.politicaCancelacion = politicaCancelacion;
        agregarObservador(new ObservadorNotificador(notificador));
    }

    public void agregarObservador(ObservadorReserva observador) {
        if (observador == null) {
            throw new IllegalArgumentException("El observador es obligatoria.");
        }

        observadores.add(observador);
    }

    public Reserva crearReserva(String idReserva, Estudiante estudiante, HorarioTutoria horario) {
        Reserva nuevaReserva = new ReservaBuilder()
                .id(idReserva)
                .estudiante(estudiante)
                .horario(horario)
                .build();
        repositorioReservas.guardar(nuevaReserva);

        notificarObservadores(nuevaReserva, "Su reserva fue creada y se encuentra pendiente de confirmación.");

        return nuevaReserva;
    }

    public void confirmarReserva(Reserva reserva) {
        if (reserva == null) {
            throw new IllegalArgumentException("La reserva es obligatoria.");
        }

        reserva.confirmar();
        repositorioReservas.guardar(reserva);

        notificarObservadores(reserva, "La reserva fue confirmada.");
    }

    public void cancelarReserva(Reserva reserva) {
        if (reserva == null) {
            throw new IllegalArgumentException("La reserva es obligatoria.");
        }

        if (!politicaCancelacion.puedeCancelar(reserva)) {
            throw new IllegalStateException("La politica no permite cancelar la reserva.");
        }

        reserva.cancelar();
        repositorioReservas.actualizar(reserva);

        notificarObservadores(reserva, "La reserva fue cancelada.");
    }

    private void notificarObservadores(Reserva reserva, String evento) {
        for (ObservadorReserva observador : observadores) {
            observador.actualizar(reserva, evento);
        }
    }
}