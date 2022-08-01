package com.Academia.controller;

import com.Academia.model.Aluno;
import com.Academia.model.form.AlunoFormCreate;
import com.Academia.model.form.AlunoFormUpdate;
import com.Academia.service.implementation.AlunoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RequestMapping("/people")
@RestController
public class AlunoController {
    @Autowired
    private AlunoImp service;

    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoFormCreate form) {
        return service.create(form);
    }

    @PutMapping(value = "/{id}")
    public Aluno update(@PathVariable("id") Long id, @RequestBody AlunoFormUpdate form) {
        return service.update(id, form);
    }

    @DeleteMapping("/{id}")
    public Aluno delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }

    @GetMapping(value = "/{id}")
    public Aluno getAluno(@PathVariable Long id) {
        return service.getAluno(id);
    }

    @GetMapping("/address/{id}")
    public List<Aluno> findAlunoByEndereco_id(@PathVariable("id") Long id) {
        return service.findAlunoByEndereco_id(id);
    }

    @GetMapping("/biotype/{id}")
    public List<Aluno>findAlunoByBiotipo_Id(@PathVariable("id") Long id){
        return service.findAlunoByBiotipo_Id(id);
    }
}