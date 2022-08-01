package com.Academia.repository;

import com.Academia.model.Biotipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiotipoRepository extends JpaRepository<Biotipo, Long> {
}
