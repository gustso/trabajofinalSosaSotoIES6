package ies6.edu.ar.tp06sosagustavo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ies6.edu.ar.tp06sosagustavo.model.Docente;
import ies6.edu.ar.tp06sosagustavo.repository.DocenteRepository;

@Service
public class DocenteServiceImp implements DocenteServiceI {

    @Autowired
    DocenteRepository docenteRepository;

    @Autowired
    Docente nuevoDocente;

    @Override
    public void borrarDocente(Integer legajo) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'borrarDocente'");
    }

    @Override
    public void agregarDocente(Docente docente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarDocente'");
    }

    @Override
    public void modificarDocente(Docente docente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificarDocente'");
    }

    @Override
    public List<Docente> listarTodosDocentes() {
        // TODO Auto-generated method stub
        return (List<Docente>) docenteRepository.findAll();
    }

    @Override
    public Docente buscarUnDocente(Integer legajo) throws Exception {
        // TODO Auto-generated method stub
        return docenteRepository.findById(legajo).orElseThrow(()-> new Exception("docente no encontrado"));
    }

    @Override
    public Docente buscarUnDocentePorNombre(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarUnDocentePorNombre'");
    }

    @Override
    public Docente crearNuevoDocente() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearNuevoDocente'");
    }

    @Override
    public List<Docente> listarTodosDocentesActivos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarTodosDocentesActivos'");
    }

}
