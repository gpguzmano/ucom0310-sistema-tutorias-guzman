package edu.uees.tutorias.domain;

public class Estudiante extends Usuario {
    private final String codigoEstudiante;

    public Estudiante(String id, String nombres, String email, String codigoMatricula) {
        super(id, nombres, email);

        if (codigoMatricula == null || codigoMatricula.isBlank()) {
            throw new IllegalArgumentException("El código del estudiante es obligatoria.");
        }

        this.codigoEstudiante = codigoMatricula;
    }

    public String getCodigoEstudiante() { return codigoEstudiante; }
}
