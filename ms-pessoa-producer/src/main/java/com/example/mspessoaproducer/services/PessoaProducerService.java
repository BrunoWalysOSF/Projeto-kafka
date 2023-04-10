package com.example.mspessoaproducer.services;

import com.example.mspessoaproducer.models.PessoaDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.io.Serializable;

@RequiredArgsConstructor
@Log4j2
@Service
public class PessoaProducerService {

    private final KafkaTemplate<String, Serializable> kafkaTemplate;

    public void sendPessoa(PessoaDTO pessoa){
        try {
            log.info("Enviando para kafka : " + pessoa.getNome());
            kafkaTemplate.send("ms-producer", pessoa);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Erro ao enviar mensagem para o Kafka", e);
        }
    }
}
