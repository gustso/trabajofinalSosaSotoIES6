package ies6.edu.ar.tp06sosagustavo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ies6.edu.ar.tp06sosagustavo.model.Materia;
import ies6.edu.ar.tp06sosagustavo.service.AlumnoServiceI;
import ies6.edu.ar.tp06sosagustavo.service.DocenteServiceI;
import ies6.edu.ar.tp06sosagustavo.service.MateriaI;

@Controller
public class MateriaController {

    @Autowired
    MateriaI materiaService;

    @Autowired
    DocenteServiceI docenteServicio;

    @Qualifier("servicioAlumnoMySQL")
    @Autowired
    AlumnoServiceI alumnoService;

    @GetMapping("/materia/{legajo}")
    public ModelAndView getMateria(@PathVariable(name = "legajo") Integer legajo) throws Exception {
                
        ModelAndView carrito = new ModelAndView("materia");
        Materia materiaNueva = materiaService.crearNuevaMateria();
        materiaNueva.setDocente(docenteServicio.buscarUnDocente(legajo));
        carrito.addObject("nuevaMateria", materiaNueva);
        carrito.addObject("lista", alumnoService.listarTodosAlumnosActivos());
        return carrito;
    }


    @PostMapping("/guardarMateria")
    public ModelAndView saveMateria(@ModelAttribute("nuevaMateria") Materia materiaParaGuardar) {
        System.out.println("estoy ingresando al metodo de guardar");
        ModelAndView modelAndView = new ModelAndView("index");
        
            try {
                materiaService.agregarMateria(materiaParaGuardar);                
            } catch (Exception e) {
                // Mensaje de ERROR
                modelAndView.addObject("errorMateria", "Error al guardar el materia: " + e.getMessage());
            }            
            System.out.println("estoy saliendo al metodo de guardar");
        
        return modelAndView;
    }
}
