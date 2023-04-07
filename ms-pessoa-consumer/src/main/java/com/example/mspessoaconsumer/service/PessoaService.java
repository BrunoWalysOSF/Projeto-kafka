package com.example.mspessoaconsumer.service;

import com.example.mspessoaconsumer.models.Pessoa;
import com.example.mspessoaconsumer.models.PessoaEntity;
import com.example.mspessoaconsumer.repository.PessoaEntityRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
@Log4j2
@org.springframework.stereotype.Service
public class PessoaService {

    @Autowired
    private PessoaEntityRepository repository;

    public void savePessoa(Pessoa pessoa){
        PessoaEntity pessoaEntity = new PessoaEntity();
        pessoaEntity.setNome(pessoa.getNome());
        pessoaEntity.setSexo(pessoa.getSexo());
        pessoaEntity.setCpf(pessoa.getCpf());
        pessoaEntity.setEndereco(pessoa.getEndereco());
        pessoaEntity.setEstadoCivil(pessoa.getEstadoCivil());
        pessoaEntity.setIdade(pessoa.getIdade());
        PessoaEntity pessoaSave = repository.save(pessoaEntity);
        log.info("Nome : " + pessoaSave.getNome() +" salva com id : " + pessoaSave.getId());
    }
}
