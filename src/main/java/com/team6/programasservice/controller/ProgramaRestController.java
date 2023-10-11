package com.team6.programasservice.controller;

import com.team6.programasservice.model.entities.Programa;
import com.team6.programasservice.model.service.IProgramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.List;

@RestController
@RequestMapping("/api/programa-service")
public class ProgramaRestController {
    @Autowired
    private IProgramaService programaService;

    @PostMapping("/programa")
    public Programa crearPrograma(@RequestBody Programa programa){
        return programaService.save(programa);
    }

    @GetMapping("/programa")
    public List<Programa> listar(){return (List<Programa>) programaService.findAll();}

    //TODO crear ENDPOINTS e implementar metodos de listar, actualizar y eliminar
}

