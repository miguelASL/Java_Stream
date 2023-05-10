package org.sarmiento.api.stream.ejemplo.models;

public class Usuario {
    private String nombre;
    private String apellido;
    private Integer id;
    private static int ultimoId;

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = ++ultimoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
