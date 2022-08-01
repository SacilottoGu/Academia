package com.Academia.controller;


import com.Academia.model.AvaliacaoFisica;
import com.Academia.model.form.AvaliacaoFisicaFormCreate;
import com.Academia.service.implementation.AvaliacaoFisicaImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/exames")
@RestController
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaImp service;

    @PostMapping
    public AvaliacaoFisica create(@Valid @RequestBody AvaliacaoFisicaFormCreate form){
        return service.create(form);
    }

    @GetMapping("/{id}")
    public AvaliacaoFisica getAvaliacaoFisica(@PathVariable("id") Long id){
        return service.getAvaliacaoFisica(id);
    }

    @GetMapping("/student/{id}")
    public List<AvaliacaoFisica> findAvaliacaoFisicaByAluno_Id(@PathVariable("id")Long id){
        return service.findAvaliacaoFisicaByAluno_Id(id);
    }
}
