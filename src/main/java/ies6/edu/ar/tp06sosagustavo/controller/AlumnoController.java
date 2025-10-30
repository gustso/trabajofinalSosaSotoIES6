package ies6.edu.ar.tp06sosagustavo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ies6.edu.ar.tp06sosagustavo.model.Alumno;
import ies6.edu.ar.tp06sosagustavo.service.AlumnoServiceI;
import jakarta.validation.Valid;

@Controller
public class AlumnoController {

    // atributo

    @Qualifier("servicioAlumnoMySQL")
    @Autowired
    AlumnoServiceI alumnoService;

    @GetMapping("/alumno")
    public ModelAndView getAlumno() {
        // public String getAlumno() {

        // Alumno nuevoAlumno = new Alumno();
        // nuevoAlumno.setApellido("Nuevo Apellido");
        // nuevoAlumno.setNombre("Nuevo Nombre");

        ModelAndView carrito = new ModelAndView("alumno");
        // codigo
        // return "alumno";
        carrito.addObject("nuevoAlumno", alumnoService.crearNuevoAlumno());
        carrito.addObject("band", false);
        return carrito;
    }

    @PostMapping("/guardarAlumno")
    public ModelAndView saveAlumno(@Valid @ModelAttribute("nuevoAlumno") Alumno alumnoParaGuardar,
            BindingResult result) {
        System.out.println("estoy ingresando al metodo de guardar");
        ModelAndView modelAndView = new ModelAndView();
        if (result.hasErrors()) {
            modelAndView.setViewName("alumno");
            modelAndView.addObject("nuevoAlumno", alumnoParaGuardar);
        } else {
            try {
                alumnoService.agregarAlumno(alumnoParaGuardar);
                modelAndView.setViewName("listaAlumnos");
                modelAndView.addObject("correcto", "¡Alumno registrado con éxito!");
            } catch (Exception e) {
                // Mensaje de ERROR
                modelAndView.addObject("errorAlumno", "Error al guardar el alumno: " + e.getMessage());
            }
            modelAndView.addObject("lista", alumnoService.listarTodosAlumnosActivos());
            System.out.println("estoy saliendo al metodo de guardar");
        }

        return modelAndView;
    }

    // ELIMINAR
    @GetMapping("/eliminarAlumno/{dni}")
    public ModelAndView eliminarAlumno(@PathVariable(name = "dni") String dni) throws Exception {
        ModelAndView carritoDeEliminar = new ModelAndView("listaAlumnos");
        alumnoService.borrarAlumno(dni);
        carritoDeEliminar.addObject("lista", alumnoService.listarTodosAlumnosActivos());

        return carritoDeEliminar;
    }

    // MODIFICAR
    @GetMapping("/modificarAlumno/{dni}")
    public ModelAndView buscarAlumnoParaModificar(@PathVariable(name = "dni") String dni) throws Exception {
        ModelAndView carritoParaModificarAlumno = new ModelAndView("alumno");
        carritoParaModificarAlumno.addObject("nuevoAlumno", alumnoService.buscarUnAlumno(dni));
        carritoParaModificarAlumno.addObject("band", true);
        return carritoParaModificarAlumno;
    }

    @PostMapping("/modificarAlumno")
    public ModelAndView modificarEstudiante(@ModelAttribute("nuevoAlumno") Alumno alumnoModificado) {
        ModelAndView listadoEditado = new ModelAndView("listaAlumnos");
        alumnoService.agregarAlumno(alumnoModificado);
        listadoEditado.addObject("lista", alumnoService.listarTodosAlumnosActivos());

        return listadoEditado;
    }

    @GetMapping("/listarAlumnos")
    public ModelAndView listarAlumnosActivos() {
        ModelAndView carritoParaMostrarAlumnos = new ModelAndView("listaAlumnos");
        carritoParaMostrarAlumnos.addObject("lista", alumnoService.listarTodosAlumnosActivos());

        return carritoParaMostrarAlumnos;
    }

    @GetMapping("/index")
    public String getIndex() {
        // codigo
        return "index";
    }
}
