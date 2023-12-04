package model;

import java.util.ArrayList;

public class Universidad {
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Carrera> carreras;

    // Constructor
    public Universidad() {
        this.estudiantes = new ArrayList<>();
        this.carreras = new ArrayList<>();
    }

    // Getters
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    // Métodos para agregar estudiantes y carreras
    public void agregarEstudiante(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }

    public void agregarCarrera(Carrera carrera) {
        this.carreras.add(carrera);
    }

    // Métodos para eliminar estudiantes y carreras
    public void eliminarEstudiante(Estudiante estudiante) {
        this.estudiantes.remove(estudiante);
    }

    public void eliminarCarrera(Carrera carrera) {
        this.carreras.remove(carrera);
    }
}