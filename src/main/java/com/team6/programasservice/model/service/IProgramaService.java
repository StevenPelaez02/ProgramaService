package com.team6.programasservice.model.service;

import com.team6.programasservice.model.entities.Programa;

import java.util.List;

public interface IProgramaService {

    Programa save(Programa programa);

    List<Programa> findAll();

    Programa findById(Long id);

    Programa modificarPrograma(Programa programa);

    void delete (Programa programa);

}
