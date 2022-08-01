package com.Academia.model.form;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Positive;

@Data
@AllArgsConstructor
public class AvaliacaoFisicaFormCreate {

    @Positive(message = "O peso tem que ser positivo")
    private double peso;

    @Positive(message = "A altura tem que ser positivo")
    private double altura;

    @Positive(message = "O id do biotipo tem que ser positivo")
    private long idBiotipo;

    @Positive(message = "O id do aluno tem que ser positivo")
    private long idAluno;
}
