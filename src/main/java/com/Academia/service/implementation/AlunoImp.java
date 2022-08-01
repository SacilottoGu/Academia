package com.Academia.service.implementation;

import com.Academia.model.Aluno;
import com.Academia.model.form.AlunoFormCreate;
import com.Academia.model.form.AlunoFormUpdate;
import com.Academia.repository.AlunoRepository;
import com.Academia.repository.EnderecoRepository;
import com.Academia.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;
import java.util.Optional;


@Service
public class AlunoImp implements AlunoService {

    @Autowired
    private AlunoRepository repository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    public Aluno create(AlunoFormCreate form) {
        Aluno aluno = new Aluno();

        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setDataDeNascimento(form.getDataDeNascimento());
        aluno.setEndereco(enderecoRepository.findById(form.getIdEndereco()).get());

        return repository.save(aluno);
    }

    @Override
    public Aluno update(Long id, AlunoFormUpdate formUpdate)  {

        Optional<Aluno> aluno = repository.findById(id);

        aluno.get().setNome(formUpdate.getNome());
        aluno.get().setDataDeNascimento(formUpdate.getDataDeNascimento());
        aluno.get().setEndereco(enderecoRepository.getReferenceById(formUpdate.getIdEndereco()));

        return repository.save(aluno.get());
    }

    @Override
    public Aluno delete(Long id) {
        repository.deleteAllById(Collections.singleton(id));
        return null;
    }

    @Override
    public Aluno getAluno(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Aluno> findAlunoByEndereco_id(Long id) {
        return repository.findAlunoByEndereco_id(id);
    }

    @Override
    public List<Aluno> findAlunoByBiotipo_Id(Long id) {
        return repository.findAlunoByBiotipo_Id(id);
    }


}
