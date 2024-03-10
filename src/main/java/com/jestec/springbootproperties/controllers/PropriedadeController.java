package com.jestec.springbootproperties.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.jestec.springbootproperties.entities.Propriedade;
import com.jestec.springbootproperties.repositories.PropriedadeRepository;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping("api")
public class PropriedadeController {

    @Autowired
    private PropriedadeRepository propriedadeRepository;

    @RequestMapping(value = "find/{filtro}", method=RequestMethod.GET)
    List<Propriedade> findByFiltro(@PathVariable("filtro") String filtro){
        return propriedadeRepository.findByFiltro(filtro);
    }
    
}
