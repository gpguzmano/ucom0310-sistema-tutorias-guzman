package edu.uees.tutorias.domain;

public class Asignatura {
    private String codigo;
    private String nombre;

    public Asignatura(String codigo, String nombre) {
        if (codigo == null || codigo.isBlank()){
            throw new IllegalArgumentException("El código es obligatorio.");
        }

        if (nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("El nombre es obligatorio.");
        }

        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
}