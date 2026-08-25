package edu.uees.tutorias.domain;

public class Asignatura {
    private String id;
    private String codigo;
    private String nombre;

    public Asignatura(String id, String codigo, String nombre) {
        if (id == null || id.isBlank()){
            throw new IllegalArgumentException("El ID es obligatorio.");
        }

        if (codigo == null || codigo.isBlank()){
            throw new IllegalArgumentException("El código es obligatorio.");
        }

        if (nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("El nombre es obligatorio.");
        }

        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getId() { return id; }
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
}