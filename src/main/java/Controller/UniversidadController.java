package Controller;

import model.Estudiante;
import model.Carrera;
import model.Universidad;

import java.util.ArrayList;

public class UniversidadController {
    private Universidad universidad;

    // Constructor
    public UniversidadController(Universidad universidad) {
        this.universidad = universidad;
    }

    public void registrarEstudiante(String nombre, String apellido, String rut, String numeroMatricula) {
        Estudiante estudiante = new Estudiante(nombre, apellido, rut, numeroMatricula);
        this.universidad.agregarEstudiante(estudiante);
    }

    public void registrarCarrera(String nombre, String codigo, int cantidadSemestres) {
        Carrera carrera = new Carrera(nombre, codigo, cantidadSemestres);
        this.universidad.agregarCarrera(carrera);
    }

    public void eliminarEstudiante(Estudiante estudiante) {
        this.universidad.eliminarEstudiante(estudiante);
    }

    public void eliminarCarrera(Carrera carrera) {
        this.universidad.eliminarCarrera(carrera);
    }

    // Método para buscar estudiantes por nombre
    public ArrayList<Estudiante> buscarEstudiantesPorNombre(String nombre) {
        ArrayList<Estudiante> estudiantesEncontrados = new ArrayList<>();
        for (Estudiante estudiante : this.universidad.getEstudiantes()) {
            if (estudiante.getNombre().equalsIgnoreCase(nombre)) {
                estudiantesEncontrados.add(estudiante);
            }
        }
        return estudiantesEncontrados;
    }

    // Método para buscar carreras por nombre
    public ArrayList<Carrera> buscarCarrerasPorNombre(String nombre) {
        ArrayList<Carrera> carrerasEncontradas = new ArrayList<>();
        for (Carrera carrera : this.universidad.getCarreras()) {
            if (carrera.getNombre().equalsIgnoreCase(nombre)) {
                carrerasEncontradas.add(carrera);
            }
        }
        return carrerasEncontradas;
    }

    public Estudiante buscarEstudiantePorNombre(String nombre) {
        for (Estudiante estudiante : this.universidad.getEstudiantes()) {
            if (estudiante.getNombre().equalsIgnoreCase(nombre)) {
                return estudiante;
            }
        }
        return null;  // Devuelve null si no se encuentra ningún estudiante con el nombre dado
    }
}


