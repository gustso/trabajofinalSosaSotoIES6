package ies6.edu.ar.tp06sosagustavo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import ies6.edu.ar.tp06sosagustavo.model.Docente;

@Service
public interface DocenteServiceI {
    public void borrarDocente(Integer legajo) throws Exception;
    public void agregarDocente(Docente docente);
    public void modificarDocente(Docente docente);
    public List<Docente> listarTodosDocentes();
    public Docente buscarUnDocente(Integer legajo) throws Exception;
    public Docente buscarUnDocentePorNombre(String nombre);
    public Docente crearNuevoDocente();
    public List<Docente> listarTodosDocentesActivos();
    
}
