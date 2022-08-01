package com.Academia.controller;

import com.Academia.model.Endereco;
import com.Academia.model.form.EnderecoFormCreate;
import com.Academia.model.form.EnderecoFormUpdate;
import com.Academia.service.implementation.EnderecoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/address")
public class EnderecoController {

    @Autowired
    private EnderecoImp service;

    @PostMapping
    public Endereco create(@Valid @RequestBody EnderecoFormCreate form){
        return service.create(form);
    }

    @PutMapping("/{id}")
    public Endereco update(@PathVariable("id") Long id, @RequestBody EnderecoFormUpdate from){
        return service.update(id,from);
    }

    @GetMapping(value = "/{id}")
    public Endereco getEndereco(@RequestBody @PathVariable Long id){
        return service.getEndereco(id);
    }
}
