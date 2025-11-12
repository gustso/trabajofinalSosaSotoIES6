package ies6.edu.ar.tp06sosagustavo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ies6.edu.ar.tp06sosagustavo.model.Docente;

@Repository
public interface DocenteRepository extends CrudRepository<Docente,Integer>{
    
}
