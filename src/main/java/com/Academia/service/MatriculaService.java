package com.Academia.service;

import com.Academia.model.Matricula;
import com.Academia.model.form.MatriculaFormCreate;

public interface MatriculaService {

    Matricula create(MatriculaFormCreate formCreate);

    Matricula getMatricula(Long id);

    Matricula getMatriculaByAluno(Long id);
}
