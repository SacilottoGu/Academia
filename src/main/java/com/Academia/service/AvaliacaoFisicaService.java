package com.Academia.service;


import com.Academia.model.AvaliacaoFisica;
import com.Academia.model.form.AvaliacaoFisicaFormCreate;

import java.util.List;

public interface AvaliacaoFisicaService {

    AvaliacaoFisica create(AvaliacaoFisicaFormCreate formCreate);

    AvaliacaoFisica getAvaliacaoFisica(Long id);

    List <AvaliacaoFisica> findAvaliacaoFisicaByAluno_Id(Long id);
}
