package com.Academia.repository;

import com.Academia.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface AlunoRepository extends JpaRepository<Aluno,Long> {
    List<Aluno> findAlunoByEndereco_id(Long id);

    List<Aluno> findAlunoByBiotipo_Id(Long id);


}
