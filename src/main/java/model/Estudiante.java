package model;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String rut;
    private String numeroMatricula;

    // Constructor sin parámetros
    public Estudiante() {}

    // Constructor con parámetros
    public Estudiante(String nombre, String apellido, String rut, String numeroMatricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.numeroMatricula = numeroMatricula;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getRut() {
        return rut;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
}

