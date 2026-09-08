package edu.uees.tutorias.domain;

public class Docente extends Usuario {
    private final String codigoDocente;

    public Docente(String id, String nombres, String email, String codigoDocente) {
        super(id, nombres, email);

        if (codigoDocente == null || codigoDocente.isBlank()) {
            throw new IllegalArgumentException("El código del docente es obligatorio.");
        }

        this.codigoDocente = codigoDocente;
    }

    public String getCodigoDocente() { return codigoDocente; }
}
