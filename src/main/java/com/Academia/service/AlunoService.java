package com.Academia.service;

import com.Academia.model.Aluno;
import com.Academia.model.form.AlunoFormCreate;
import com.Academia.model.form.AlunoFormUpdate;
import java.util.List;

public interface AlunoService {

    Aluno create(AlunoFormCreate form);

    Aluno update(Long id, AlunoFormUpdate formUpdate);

    Aluno delete(Long id);

    Aluno getAluno(Long Id);

    List<Aluno> findAlunoByEndereco_id(Long id);

    List<Aluno> findAlunoByBiotipo_Id(Long id);


}
