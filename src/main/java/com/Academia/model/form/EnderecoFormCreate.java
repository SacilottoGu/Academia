package com.Academia.model.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
public class EnderecoFormCreate {
    private final String mensagem = "Preencher de Forma Correta";

    @NotEmpty(message = mensagem)
    @Size(min = 3, max = 70)
    private String rua;

    @NotEmpty(message = mensagem)
    @Size(min = 1, max = 10000)
    private String numero;

    @NotEmpty(message = mensagem)
    @Size(min = 3, max = 70)
    private String bairro;

    @NotEmpty(message = mensagem)
    @Size(min = 3, max = 70)
    private String cidade;

    @NotEmpty(message = mensagem)
    @Size(min = 3, max = 70)
    private String estado;

    @NotEmpty(message = mensagem)
    @Size(min = 3, max = 70)
    private String cep;

    @NotEmpty(message = mensagem)
    @Size(min = 3, max = 70)
    private String pais;
}
