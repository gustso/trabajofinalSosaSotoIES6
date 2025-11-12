package ies6.edu.ar.tp06sosagustavo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import ies6.edu.ar.tp06sosagustavo.model.Materia;

@Service
public interface MateriaI {
    
    public void agregarMateria(Materia materia);
    public Materia crearNuevaMateria();
    public List<Materia> listarTodosMateria();
    

}
