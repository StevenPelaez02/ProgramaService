package com.team6.programasservice.controller;

import com.team6.programasservice.model.entities.Programa;
import com.team6.programasservice.model.service.IProgramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/programa-service")
public class ProgramaRestController {
    @Autowired
    private IProgramaService programaService;

    @PostMapping("/programa")
    public Programa crearPrograma(@RequestBody Programa programa){
        return programaService.save(programa);
    }

    //TODO crear ENDPOINTS e implementar metodos de listar, actualizar y eliminar
}
