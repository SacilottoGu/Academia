package com.Academia.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "address")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_address")
    private Long id;

    @Column(name = "street")
    private String rua;

    @Column(name = "number")
    private String numero;

    @Column(name = "neighborhood")
    private String bairro;

    @Column(name = "city")
    private String cidade;

    @Column(name = "state")
    private String estado;

    @Column(name = "zip_cod")
    private String cep;

    @Column(name = "country")
    private String pais;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "endereco", fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Aluno> alunos = new ArrayList<>();

}
