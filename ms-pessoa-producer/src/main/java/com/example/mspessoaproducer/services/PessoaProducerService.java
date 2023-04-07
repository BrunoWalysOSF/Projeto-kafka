package com.example.mspessoaproducer.services;

import com.example.mspessoaproducer.models.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@RequiredArgsConstructor
@Log4j2
@Service
public class PessoaProducerService {

    private final KafkaTemplate<String, Serializable> kafkaTemplate;

    public void sendPessoa(Pessoa pessoa){
        log.info("Enviando : " + pessoa.getNome());
        kafkaTemplate.send("ms-producer", pessoa);

    }
}
