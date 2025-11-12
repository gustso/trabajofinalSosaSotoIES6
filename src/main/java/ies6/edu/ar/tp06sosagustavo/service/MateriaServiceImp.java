package ies6.edu.ar.tp06sosagustavo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ies6.edu.ar.tp06sosagustavo.model.Materia;
import ies6.edu.ar.tp06sosagustavo.repository.MateriaRepository;

@Service
public class MateriaServiceImp implements MateriaI{

    @Autowired
    Materia materia;

    @Autowired
    MateriaRepository materiaRepository;

    @Override
    public void agregarMateria(Materia materia) {
        // TODO Auto-generated method stub
        materiaRepository.save(materia);
    }

    @Override
    public List<Materia> listarTodosMateria() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarTodosMateria'");
    }

    @Override
    public Materia crearNuevaMateria() {
        // TODO Auto-generated method stub
        return materia;
    }

}
