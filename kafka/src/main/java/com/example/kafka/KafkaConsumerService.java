package com.example.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "nautilus-topic", groupId = "my-group")
    public void listen(String message) {
        System.out.println("Received Message from Kafka: " + message);
    }
}