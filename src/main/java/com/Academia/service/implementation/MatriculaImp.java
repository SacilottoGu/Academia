package com.Academia.service.implementation;

import com.Academia.model.Aluno;
import com.Academia.model.Matricula;
import com.Academia.model.form.MatriculaFormCreate;
import com.Academia.repository.MatriculaRepository;
import com.Academia.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriculaImp implements MatriculaService {

    @Autowired
    private MatriculaRepository repository;

    @Autowired
    private AlunoImp alunoImp;

    @Override
    public Matricula create(MatriculaFormCreate formCreate) {

        Matricula matricula = new Matricula();
        Aluno aluno = alunoImp.getAluno(formCreate.getIdAluno());

        matricula.setCondicaoAluno(formCreate.getCondicaoAluno());
        matricula.setAluno(aluno);

        return repository.save(matricula);
    }

    @Override
    public Matricula getMatricula(Long id) {
        Matricula matricula = repository.getReferenceById(id);
        return repository.findById(id).orElse(null);
    }

    @Override
    public Matricula getMatriculaByAluno(Long id) {
        return repository.findMatriculaByAluno_Id(id) ;
    }
}


