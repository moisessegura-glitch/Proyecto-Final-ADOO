package com.moises.empresa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.moises.empresa.service.EmpleadoService;
import com.moises.empresa.model.Empleado;

@Controller
public class EmpleadoController {

    @Autowired
    private EmpleadoService service;

    @PostMapping("/empleados")
    public String agregarEmpleado(@RequestParam String nombre, @RequestParam String puesto) {
        Empleado e = new Empleado();
        e.setNombre(nombre);
        e.setPuesto(puesto);
        service.guardar(e);
        return "redirect:/";
    }

    @PostMapping("/empleados/eliminar")
    public String eliminarEmpleado(@RequestParam Long id) {
        service.eliminar(id);
        return "redirect:/";
    }
}
