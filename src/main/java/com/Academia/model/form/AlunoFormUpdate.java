package com.Academia.model.form;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class AlunoFormUpdate {

    @NotBlank
    @Size(min = 3, max = 200, message= "'${validateValue}' precisa ter no minimo {min} e no maximo {max} caracteres")
    private String nome;

    @NotNull(message = "Campo obrigatorio o preenchimento")
    private LocalDate dataDeNascimento;

    @Positive(message = "O endereco tem que ser positivo")
    @NotNull(message = "Campo Obrigatorio a ser preenchido")
    private Long idEndereco;

}
