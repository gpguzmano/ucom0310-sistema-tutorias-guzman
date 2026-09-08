package edu.uees.tutorias.domain;

public class Estudiante extends Usuario {
    private final String matricula;

    public Estudiante(String id, String nombres, String email, String celular, String matricula) {
        super(id, nombres, email, celular);

        if (matricula == null || matricula.isBlank()) {
            throw new IllegalArgumentException("La matricula es obligatoria.");
        }

        this.matricula = matricula;
    }

    public String getMatricula() { return matricula; }
}
