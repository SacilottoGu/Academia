package com.Academia.service.implementation;

import com.Academia.model.Biotipo;
import com.Academia.model.form.BiotipoFormCreate;
import com.Academia.model.form.BiotipoFormUpdate;
import com.Academia.repository.BiotipoRepository;
import com.Academia.service.BiotipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Service
public class BiotipoImp implements BiotipoService {

    @Autowired
    BiotipoRepository repository;


    @Override
    public Biotipo create(BiotipoFormCreate form) {

        Biotipo biotipo = new Biotipo();

        biotipo.setNome(form.getNome());

        return repository.save(biotipo);
    }

    @Override
    public Biotipo update(Long id, BiotipoFormUpdate formUpdate) {

        Optional <Biotipo> biotipo = repository.findById(id);

        biotipo.get().setNome(formUpdate.getNome());

        return repository.save(biotipo.get());
    }

    @Override
    public Biotipo delete(Long id) {

        repository.deleteAllByIdInBatch(Collections.singleton(id));

        return null;
    }


    @Override
    public Biotipo getBiotipo(Long id) {

        Biotipo biotipo = repository.getReferenceById(id);
        return repository.findById(id).orElse(null);
    }
}
