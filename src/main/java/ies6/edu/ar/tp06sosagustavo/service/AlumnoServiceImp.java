package ies6.edu.ar.tp06sosagustavo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ies6.edu.ar.tp06sosagustavo.model.Alumno;

@Service
@Qualifier("servicioAlumnoArrayList")
public class AlumnoServiceImp implements AlumnoServiceI{

    List<Alumno> listadoDeAlumnos = new ArrayList<Alumno>();

    @Autowired
    Alumno nuevoAlumno;

    @Override
    public void borrarAlumno(String dni) {
        // TODO Auto-generated method stub
        
        throw new UnsupportedOperationException("Unimplemented method 'borrarAlumno'");
    }

    @Override
    public void agregarAlumno(Alumno alumno) {        
        listadoDeAlumnos.add(alumno);
        System.out.println(listadoDeAlumnos.size());

    }

    @Override
    public void modificarAlumno(Alumno alumno) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificarAlumno'");
    }

    @Override
    public List<Alumno> listarTodosAlumnos() {
        
        return listadoDeAlumnos;
    }

    @Override
    public Alumno buscarUnAlumno(String dni) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarUnAlumno'");
    }

    @Override
    public Alumno buscarUnPorNombreAlumno(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarUnPorNombreAlumno'");
    }

    @Override
    public Alumno crearNuevoAlumno() {
        // lógica para crear nuevo alumno
        // Alumno nuevoAlumno = new Alumno();
        return nuevoAlumno;

    }

    @Override
    public List<Alumno> listarTodosAlumnosActivos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarTodosAlumnosActivos'");
    }
    
}
