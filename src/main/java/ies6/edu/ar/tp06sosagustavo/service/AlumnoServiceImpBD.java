package ies6.edu.ar.tp06sosagustavo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ies6.edu.ar.tp06sosagustavo.model.Alumno;
import ies6.edu.ar.tp06sosagustavo.repository.AlumnoRepository;

@Service
@Qualifier("servicioAlumnoMySQL")
public class AlumnoServiceImpBD implements AlumnoServiceI {

    @Autowired
    Alumno nuevoAlumno;

    @Autowired
    AlumnoRepository alumnoRepository;

    @Override
    public void borrarAlumno(String dni) throws Exception {
        Alumno alumnoBorrar = alumnoRepository.findById(dni).orElseThrow(()-> new Exception("alumno no encontrado"));
        alumnoBorrar.setEstado(false);
        alumnoRepository.save(alumnoBorrar);
        // alumnoRepository.deleteById(dni);
    }

    @Override
    public void agregarAlumno(Alumno alumno) {
        alumno.setEstado(true);
        alumnoRepository.save(alumno);
    }

    @Override
    public void modificarAlumno(Alumno alumno) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificarAlumno'");
    }

    @Override
    public List<Alumno> listarTodosAlumnos() {
        //alumnoRepository.
        return (List<Alumno>) alumnoRepository.findAll();
    }

    @Override
    public Alumno buscarUnAlumno(String dni) throws Exception {
        return alumnoRepository.findById(dni).orElseThrow(()-> new Exception("alumno no encontrado"));
        
    }

    @Override
    public Alumno buscarUnPorNombreAlumno(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarUnPorNombreAlumno'");
    }

    @Override
    public Alumno crearNuevoAlumno() {
        return nuevoAlumno;
    }

    @Override
    public List<Alumno> listarTodosAlumnosActivos() {
        return alumnoRepository.findByEstado(true);
    }

    
    
}
