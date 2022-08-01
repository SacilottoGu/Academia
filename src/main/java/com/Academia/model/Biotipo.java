package com.Academia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "biotype")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Biotipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_biotype")
    private long id;

    @Column(name = "name_biotype")
    private String nome;

}
