package edu.uees.tutorias.domain;

public abstract class Usuario {
    protected final String id;
    protected final String nombre;
    protected final String correo;
    protected final String celular;

    public Usuario(String id, String nombre, String correo, String celular) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("El ID es obligatorio.");
        }

        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre es obligatorio.");
        }

        if (correo == null || correo.isBlank()) {
            throw new IllegalArgumentException("El correo es obligatorio.");
        }

        if (celular == null || celular.isBlank()) {
            throw new IllegalArgumentException("El celular es obligatorio.");
        }

        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCorreo() { return correo; }
    public String getCelular() { return celular; }
}
