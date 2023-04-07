package com.example.mspessoaproducer.config;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;

@Configuration
public class KafkaAdminConfig {

    @Autowired
    public KafkaProperties properties;

    @Bean
    public KafkaAdmin kafkaAdmin(){
        HashMap<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, properties.getBootstrapServers());
        return new KafkaAdmin(configs);
    }

    @Bean
    public KafkaAdmin.NewTopics newTopics(){
        return new KafkaAdmin.NewTopics(
                TopicBuilder.name("ms-producer").partitions(2).replicas(1).build()
        );
    }
}
