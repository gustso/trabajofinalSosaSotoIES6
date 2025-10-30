package ies6.edu.ar.tp06sosagustavo.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Component
@Entity
public class Alumno {
    // atributos
    @Id
    private String dni;
    @Column
    private String nombre;
    @Column
    @NotBlank(message="apellido es un campo requerido")
    @NotNull(message="apellido is required")
    @Size(min=4, max=10, message="debe tener mas de 4 caracteres y menos de 10")
    private String apellido;
    @Column
    private LocalDate fechaNac;
    @Column
    private Boolean estado;

    // constructores
    public Alumno() {
    }

    public Alumno(String dni, String nombre, String apellido, LocalDate fechaNac) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }

    // métodos particulares o accesores de los atributos

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

}
