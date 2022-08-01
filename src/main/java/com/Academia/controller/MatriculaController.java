package com.Academia.controller;

import com.Academia.model.Matricula;
import com.Academia.model.form.MatriculaFormCreate;
import com.Academia.service.implementation.MatriculaImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/registration")
public class MatriculaController {

    @Autowired
    private MatriculaImp service;

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaFormCreate form){
        return service.create(form);
    }

    @GetMapping("/person/{id}")
    public Matricula getMatriculaByAluno(@PathVariable("id")Long id){
        return service.getMatriculaByAluno(id);
    }

    @GetMapping("/{id}")
    public Matricula getMatricula(@PathVariable("id") Long id){
        return  service.getMatricula(id);
    }
}
