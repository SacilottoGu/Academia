package com.Academia.repository;

import com.Academia.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends JpaRepository <Matricula, Long>{

    Matricula findMatriculaByAluno_Id(Long id);

}
