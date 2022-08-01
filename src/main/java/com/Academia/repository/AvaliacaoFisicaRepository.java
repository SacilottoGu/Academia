package com.Academia.repository;

import com.Academia.model.AvaliacaoFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AvaliacaoFisicaRepository extends JpaRepository<AvaliacaoFisica, Long> {


    List<AvaliacaoFisica> findAvaliacaoFisicaByAluno_Id(Long id);
}
