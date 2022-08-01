package com.Academia.model.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class AlunoFormCreate {


    @Size(min = 3, max = 200, message= "'${validateValue}' precisa ter no minimo {min} e no maximo {max} caracteres")
    @NotBlank
    private String nome;

    @CPF(message = "'${validatedValue}' é inválido!")
    private String cpf;

    @NotNull(message = "Campo Obrigatorio a ser preenchido")
    private LocalDate dataDeNascimento;

    @Positive(message = "O endereco tem que ser positivo")
    private long idEndereco;
}
