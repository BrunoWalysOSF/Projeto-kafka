package com.example.mspessoaconsumer.listener;

import com.example.mspessoaconsumer.models.Pessoa;
import com.example.mspessoaconsumer.service.PessoaService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class JsonListener {

    @Autowired
    private PessoaService pessoaService;

    @KafkaListener(topics = "ms-producer", groupId = "group-1", containerFactory = "jsonContainerFactory")
    public void received(@Payload Pessoa pessoa){
        log.info("Recebendo pessoa nome : " + pessoa.getNome());
        pessoaService.savePessoa(pessoa);

    }
}
