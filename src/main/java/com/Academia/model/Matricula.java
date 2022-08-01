package com.Academia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "registration")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_registration")
    private long id;

    @Column(name = "date_registration")
    private LocalDate dataDaMatricula = LocalDate.now();

    @Column(name = "status")
    private String condicaoAluno;

    @OneToOne
    @JoinColumn(name = "fk_aluno")
    private Aluno aluno;
}
