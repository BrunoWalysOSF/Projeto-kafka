package com.example.mspessoaproducer.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa implements Serializable {

    private String nome;
    private int idade;
    private String endereco;
    private String sexo;
    private String estadoCivil;
    private String cpf;


}
