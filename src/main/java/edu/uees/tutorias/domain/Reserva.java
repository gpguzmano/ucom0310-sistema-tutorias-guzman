package edu.uees.tutorias.domain;

import java.time.LocalDateTime;

public final class Reserva {
    private final String id;
    private final Estudiante estudiante;
    private final HorarioTutoria horario;
    private final Modalidad modalidad;
    private EstadoReserva estado;
    private final LocalDateTime fechaCreacion;
    private String enlaceReunion;

    public Reserva(String id, Estudiante estudiante, HorarioTutoria horario, Modalidad modalidad, EstadoReserva estado) {
        this.id = id;
        this.estudiante = estudiante;
        this.horario = horario;
        this.modalidad = modalidad;
        this.estado = estado;
        this.fechaCreacion = LocalDateTime.now();
        this.horario.ocuparHorario();
    }

    public void confirmar() {
        if (this.estado != EstadoReserva.PENDIENTE) {
            throw new IllegalStateException("Solo se pueden confirmar reservas en estado PENDIENTE.");
        }
        this.estado = EstadoReserva.CONFIRMADA;
    }

    public void cancelar() {
        if (this.estado == EstadoReserva.REALIZADA) {
            throw new IllegalStateException("No se puede cancelar una reserva que ya fue realizada.");
        }
        this.estado = EstadoReserva.CANCELADA;
        this.horario.liberarHorario();
    }

    public void marcarComoRealizada() {
        if (this.estado != EstadoReserva.CONFIRMADA) {
            throw new IllegalStateException("Solo se pueden marcar como realizadas reservas CONFIRMADAS.");
        }
        this.estado = EstadoReserva.REALIZADA;
    }

    public String getId() { return id; }
    public Estudiante getEstudiante() { return estudiante; }
    public HorarioTutoria getHorario() { return horario; }
    public EstadoReserva getEstado() { return estado; }
    public LocalDateTime getFechaCreacion() { return fechaCreacion; }
    public String getEnlaceReunion() { return enlaceReunion; }

    public void asginarEnlaceReunion(String enlaceReunion) {
        this.enlaceReunion = enlaceReunion;
    }
}