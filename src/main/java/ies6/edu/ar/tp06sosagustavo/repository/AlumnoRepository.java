package ies6.edu.ar.tp06sosagustavo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ies6.edu.ar.tp06sosagustavo.model.Alumno;

// JpaRepository

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno,String>{
	public List<Alumno> findByEstado (Boolean estado);    

}
