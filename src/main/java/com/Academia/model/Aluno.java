package com.Academia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fk_aluno")
    private long id;

    @Column(name = "name")
    private String nome;

    @Column(name = "cpf", unique = true)
    private String cpf;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "id_address")
    private Endereco endereco;

    @Column(name = "date_bith")
    private LocalDate dataDeNascimento;

    @OneToOne
    @JoinColumn(name = "id_biotype")
    private Biotipo biotipo;

}
