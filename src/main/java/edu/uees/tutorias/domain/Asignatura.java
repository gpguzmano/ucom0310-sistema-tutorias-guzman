package edu.uees.tutorias.domain;

public class Asignatura {
    private String id;
    private String codigo;
    private String nombre;

    public Asignatura(String id, String codigo, String nombre) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getId() { return id; }
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
}