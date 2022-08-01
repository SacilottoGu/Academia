package com.Academia.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "exames")
public class AvaliacaoFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_exame")
    private long id;

    @Column(name = "weight")
    private double peso;

    @Column(name = "height ")
    private double altura;

    @OneToOne
    @JoinColumn(name = "id_biotype")
    private Biotipo biotipo;

    @ManyToOne
    @JoinColumn(name = "fk_aluno")
    private Aluno aluno;

}
