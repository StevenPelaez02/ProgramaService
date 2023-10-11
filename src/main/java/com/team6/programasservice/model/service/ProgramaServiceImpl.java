package com.team6.programasservice.model.service;

import com.team6.programasservice.model.dao.IProgramaDao;
import com.team6.programasservice.model.entities.Programa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramaServiceImpl implements IProgramaService{
    @Autowired
    IProgramaDao programaDao;


    @Override
    public Programa save(Programa programa) {
        return programaDao.save(programa);
    }

    //TODO sobreescribir metodos de la interface de listar, buscar y eliminar
}
