package ies6.edu.ar.tp06sosagustavo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import ies6.edu.ar.tp06sosagustavo.service.DocenteServiceI;

@Controller
public class DocenteController {

    @Autowired
    DocenteServiceI docenteService;

    @GetMapping("/docente")
    public String getDocente() {
        //codigo
        return "docente";
    }

    @GetMapping("/listarDocentes")
    public ModelAndView listarDocentesActivos() {
        ModelAndView carritoParaMostrarDocentes = new ModelAndView("listaDocentes");
        carritoParaMostrarDocentes.addObject("listaD", docenteService.listarTodosDocentes());

        return carritoParaMostrarDocentes;
    }
}
