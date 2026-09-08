package edu.uees.tutorias.builder;

import edu.uees.tutorias.domain.*;

public class ReservaBuilder {
    private String id;
    private Estudiante estudiante;
    private HorarioTutoria horario;
    private Modalidad modalidad = Modalidad.PRESENCIAL;
    private EstadoReserva estado = EstadoReserva.PENDIENTE;

    public ReservaBuilder id(String id) {
        this.id = id;

        return this;
    }

    public ReservaBuilder estudiante(Estudiante estudiante) {
        this.estudiante = estudiante;

        return this;
    }

    public ReservaBuilder horario(HorarioTutoria horario) {
        this.horario = horario;

        return this;
    }

    public ReservaBuilder modalidad(Modalidad modalidad) {
        this.modalidad = modalidad;

        return this;
    }

    public Reserva build() {
        validar();

        return new Reserva(id, estudiante, horario, modalidad, estado);
    }

    private void validar() {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("El ID es obligatorio.");
        }

        if (estudiante == null) {
            throw new IllegalArgumentException("El estudiante es obligatorio.");
        }

        if (horario == null) {
            throw new IllegalArgumentException("El horario es obligatorio.");
        }

        if (!horario.estaDisponible()) {
            throw new IllegalArgumentException("No se puede crear una reserva para un horario no disponible.");
        }
    }
}
