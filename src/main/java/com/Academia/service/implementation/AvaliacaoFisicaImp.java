package com.Academia.service.implementation;

import com.Academia.model.Aluno;
import com.Academia.model.AvaliacaoFisica;
import com.Academia.model.Biotipo;
import com.Academia.model.form.AvaliacaoFisicaFormCreate;
import com.Academia.repository.AlunoRepository;
import com.Academia.repository.AvaliacaoFisicaRepository;
import com.Academia.service.AvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaImp implements AvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository repository;

    @Autowired
    private AlunoImp alunoImp;

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private BiotipoImp biotipoImp;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaFormCreate formCreate) {

        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Biotipo biotipo = biotipoImp.getBiotipo(formCreate.getIdBiotipo());
        Aluno aluno = alunoImp.getAluno(formCreate.getIdAluno());

        avaliacaoFisica.setPeso(formCreate.getPeso());
        avaliacaoFisica.setAltura(formCreate.getAltura());
        avaliacaoFisica.setBiotipo(biotipo);
        avaliacaoFisica.setAluno(aluno);

        aluno.setBiotipo(biotipo);

        alunoRepository.save(aluno);

        return repository.save(avaliacaoFisica);
    }

    @Override
    public AvaliacaoFisica getAvaliacaoFisica(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List <AvaliacaoFisica> findAvaliacaoFisicaByAluno_Id(Long id) {
        return repository.findAvaliacaoFisicaByAluno_Id(id);
    }


}
