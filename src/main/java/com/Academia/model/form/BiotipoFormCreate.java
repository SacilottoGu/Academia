package com.Academia.model.form;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class BiotipoFormCreate {

    @NotBlank( message = "Obrigatorio o preenchimento")
    @Size(min = 7, max = 10)
    private String nome;

}


