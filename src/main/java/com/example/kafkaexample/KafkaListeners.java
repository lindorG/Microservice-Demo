package com.example.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "example",
            groupId = "groupId" // As you gain more listeners, this should be changed so that it's unique
    )
    void listener(String data) {
        System.out.println("Listener received: " + data + "!");
    }
}