package com.example.kafka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaTestController {

    private final KafkaProducerService producerService;

    public KafkaTestController(KafkaProducerService producerService) {
        this.producerService = producerService;
    }

    // URL: http://localhost:8080/send?msg=HelloKafka
    @GetMapping("/send")
    public String send(@RequestParam("msg") String msg) {
        producerService.sendMessage(msg);
        return "Message sent to Kafka successfully!";
    }
}