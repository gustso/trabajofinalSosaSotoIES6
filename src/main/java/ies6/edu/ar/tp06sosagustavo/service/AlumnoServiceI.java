package ies6.edu.ar.tp06sosagustavo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ies6.edu.ar.tp06sosagustavo.model.Alumno;

@Service
public interface AlumnoServiceI {
    // declaración de métodos
    // nominativo solo nombre

    public void borrarAlumno(String dni) throws Exception;
    public void agregarAlumno(Alumno alumno);
    public void modificarAlumno(Alumno alumno);
    public List<Alumno> listarTodosAlumnos();
    public Alumno buscarUnAlumno(String dni) throws Exception;
    public Alumno buscarUnPorNombreAlumno(String nombre);
    public Alumno crearNuevoAlumno();
    public List<Alumno> listarTodosAlumnosActivos();
}
