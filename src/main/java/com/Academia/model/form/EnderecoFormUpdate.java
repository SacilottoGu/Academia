package com.Academia.model.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
public class EnderecoFormUpdate {

    @NotBlank
    private String rua;

    @NotBlank
    private String numero;

    @NotBlank
    private String bairro;

    @NotBlank
    private String cidade;

    @NotBlank
    private String estado;

    @NotBlank
    private String cep;

    @NotBlank
    private String pais;
}
