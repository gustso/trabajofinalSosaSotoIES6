package ies6.edu.ar.tp06sosagustavo.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.*;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;

@Component
@Entity
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer legajo;
    @Column
    private String apellido;

    public Docente() {
    }
    
    public Docente(Integer legajo, String apellido) {
        this.legajo = legajo;
        this.apellido = apellido;
    }

    public Integer getLegajo() {
        return legajo;
    }
    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    

}
