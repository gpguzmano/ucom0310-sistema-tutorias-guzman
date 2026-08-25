package edu.uees.tutorias.domain;

import java.time.LocalDateTime;

public class HorarioTutoria {
    private String id;
    private Docente docente;
    private Asignatura asignatura;
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;
    private boolean disponible;

    public HorarioTutoria(String id, Docente docente, Asignatura asignatura, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFin) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("El ID es obligatorio,");
        }

        if (docente == null) {
            throw new IllegalArgumentException("El docente es obligatorio.");
        }

        if (asignatura == null) {
            throw new IllegalArgumentException("La asignatura es obligatoria.");
        }

        if (fechaHoraInicio == null) {
            throw new IllegalArgumentException("La fecha/hora inicio es obligatoria.");
        }

        if (fechaHoraFin == null) {
            throw new IllegalArgumentException("La fecha/hora fin es obligatoria.");
        }

        this.id = id;
        this.docente = docente;
        this.asignatura = asignatura;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.disponible = true;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void ocuparHorario() {
        if (!disponible) {
            throw new IllegalStateException("El horario ya no se encuentra disponible.");
        }
        this.disponible = false;
    }

    public void liberarHorario() {
        this.disponible = true;
    }

    public String getId() { return id; }
    public Docente getDocente() { return docente; }
    public Asignatura getAsignatura() { return asignatura; }
    public LocalDateTime getFechaHoraInicio() { return fechaHoraInicio; }
    public LocalDateTime getFechaHoraFin() { return fechaHoraFin; }
}