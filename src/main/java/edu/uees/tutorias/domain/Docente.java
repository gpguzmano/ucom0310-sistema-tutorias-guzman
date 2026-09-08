package edu.uees.tutorias.domain;

public class Docente extends Usuario {
    private final String departamento;

    public Docente(String id, String nombres, String email, String celular, String departamento) {
        super(id, nombres, email, celular);

        if (departamento == null || departamento.isBlank()) {
            throw new IllegalArgumentException("El departamento es obligatorio.");
        }

        this.departamento = departamento;
    }

    public String getDepartamento() { return departamento; }
}
