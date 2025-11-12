package ies6.edu.ar.tp06sosagustavo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import ies6.edu.ar.tp06sosagustavo.model.Materia;

@Repository
public interface MateriaRepository extends CrudRepository<Materia,Integer>{
    
}
