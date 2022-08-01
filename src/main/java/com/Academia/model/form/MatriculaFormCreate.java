package com.Academia.model.form;

import lombok.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
public class MatriculaFormCreate {


    @NotBlank
    @Size(min = 3, max = 200, message= "'${validateValue}' precisa ter no minimo {min} e no maximo {max} caracteres")
    private String CondicaoAluno;

    @Positive(message = "O endereco tem que ser positivo")
    private long idAluno;

}
