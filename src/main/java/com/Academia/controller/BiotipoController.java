package com.Academia.controller;

import com.Academia.model.Biotipo;
import com.Academia.model.form.BiotipoFormCreate;
import com.Academia.model.form.BiotipoFormUpdate;
import com.Academia.service.implementation.BiotipoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/biotype")
@RestController
public class BiotipoController {

    @Autowired
    private BiotipoImp service;

    @PostMapping
    public Biotipo create(@Valid @RequestBody BiotipoFormCreate form){
        return service.create(form);
    }

    @PutMapping(value = "/{id}")
    public Biotipo update(@PathVariable("id") Long id, @RequestBody BiotipoFormUpdate formUpdate){
        return service.update(id, formUpdate);
    }

    @DeleteMapping(value = "/{id}")
    public Biotipo delete(@PathVariable("id") Long id){
        return service.delete(id);
    }

    @GetMapping(value = "/{id}")
    public Biotipo getBiotipe(@PathVariable("id") Long id){
        return service.getBiotipo(id);
    }


}
