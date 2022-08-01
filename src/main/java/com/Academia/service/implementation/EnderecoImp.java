package com.Academia.service.implementation;

import com.Academia.model.Endereco;
import com.Academia.model.form.EnderecoFormCreate;
import com.Academia.model.form.EnderecoFormUpdate;
import com.Academia.repository.EnderecoRepository;
import com.Academia.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class EnderecoImp implements EnderecoService {

    @Autowired
    private EnderecoRepository repository;

    @Override
    public Endereco create(EnderecoFormCreate form) {
        Endereco endereco =  new Endereco();

        endereco.setRua(form.getRua());
        endereco.setNumero(form.getNumero());
        endereco.setBairro(form.getBairro());
        endereco.setCep(form.getCep());
        endereco.setCidade(form.getCidade());
        endereco.setEstado(form.getEstado());
        endereco.setPais(form.getPais());

        return repository.save(endereco);
    }

    @Override
    public Endereco update(Long id, EnderecoFormUpdate formUpdate) {

        Optional <Endereco> endereco = repository.findById(id);

        endereco.get().setRua(formUpdate.getRua());
        endereco.get().setNumero(formUpdate.getNumero());
        endereco.get().setBairro(formUpdate.getBairro());
        endereco.get().setCidade(formUpdate.getCidade());
        endereco.get().setCidade(formUpdate.getCidade());
        endereco.get().setEstado(formUpdate.getEstado());
        endereco.get().setPais(formUpdate.getPais());

        return repository.save(endereco.get());
    }

    @Override
    public Endereco getEndereco(Long id) {

        Endereco endereco = repository.getReferenceById(id);

        return repository.findById(id).orElse(null);
    }
}
