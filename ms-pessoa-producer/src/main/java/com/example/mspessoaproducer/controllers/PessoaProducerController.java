package com.example.mspessoaproducer.controllers;

import com.example.mspessoaproducer.models.Pessoa;
import com.example.mspessoaproducer.services.PessoaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaProducerController {

    @Autowired
    private PessoaProducerService pessoaProducerService;

    @PostMapping
    public ResponseEntity<?> sendPessoa(@RequestBody Pessoa pessoa){
        pessoaProducerService.sendPessoa(pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
