package com.Academia.model.form;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class BiotipoFormUpdate {

    @Size(min = 7, max = 10)
    @NotBlank
    private String nome;

}
