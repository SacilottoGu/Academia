package com.Academia.service;

import com.Academia.model.Endereco;
import com.Academia.model.form.EnderecoFormCreate;
import com.Academia.model.form.EnderecoFormUpdate;

public interface EnderecoService  {

    Endereco create(EnderecoFormCreate form);

    Endereco update(Long id, EnderecoFormUpdate formUpdate);
    Endereco getEndereco(Long id);
}
