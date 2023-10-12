package com.team6.programasservice.model.service;

import com.team6.programasservice.model.dao.IProgramaDao;
import com.team6.programasservice.model.entities.Programa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProgramaServiceImpl implements IProgramaService{

    @Autowired
    IProgramaDao programaDao;

    @Transactional(readOnly = true)
    @Override
    public List<Programa> findAll(){
        List<Programa> programas = (List<Programa>)programaDao.findAll();
        return programas;
    }
    @Override
    public Programa findById(Long codigo){return (Programa) programaDao.findById(codigo).get();}

    @Override
    public Programa save(Programa programa) {
        return programaDao.save(programa);
    }

    //TODO sobreescribir metodos de la interface de listar, buscar y eliminar

    @Override
    public Programa modificarPrograma(Programa programa){return programaDao.save(programa);}
}
