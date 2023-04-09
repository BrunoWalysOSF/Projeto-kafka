package com.example.mspessoaproducer.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Valid
public class PessoaDTO implements Serializable {

    @NotBlank
    private String nome;
    @NotNull(message = "O campo não pode ser nulo")
    @DecimalMin(value = "1", inclusive = true, message = "Idade invalida")
    @DecimalMax(value = "150", inclusive = true, message = "Idade invalida")
    private int idade;
    @NotBlank
    private String endereco;
    @NotBlank
    private String sexo;
    @NotBlank
    private String estadoCivil;
    @NotBlank
    @CPF(message = "O CPF informado é inválido")
    private String cpf;


}
