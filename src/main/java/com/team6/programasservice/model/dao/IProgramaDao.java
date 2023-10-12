package com.team6.programasservice.model.dao;

import com.team6.programasservice.model.entities.Programa;
import org.springframework.data.repository.CrudRepository;

public interface IProgramaDao extends CrudRepository<Programa, Long> {


}
