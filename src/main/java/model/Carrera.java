package model;

import java.util.ArrayList;

public class Carrera {
    private String nombre;
    private String codigo;
    private int cantidadSemestres;
    private ArrayList<Estudiante> estudiantes;

    // Constructor
    public Carrera(String nombre, String codigo, int cantidadSemestres) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidadSemestres = cantidadSemestres;
        this.estudiantes = new ArrayList<>();
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCantidadSemestres() {
        return cantidadSemestres;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCantidadSemestres(int cantidadSemestres) {
        this.cantidadSemestres = cantidadSemestres;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }

    public void eliminarEstudiante(Estudiante estudiante) {
        this.estudiantes.remove(estudiante);
    }
}
