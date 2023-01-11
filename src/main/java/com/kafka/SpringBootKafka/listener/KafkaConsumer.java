package com.kafka.SpringBootKafka.listener;

import com.kafka.SpringBootKafka.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics="kafka_example", groupId = "group_id")
    public void consume(String message){
    System.out.println("Consumed message :"+ message);
}

    @KafkaListener(topics="kafka_example_json", groupId = "group_json",
            containerFactory = "kafkaUserListener")
    public void consumeUser(User user){
        System.out.println("Consumed JSON message :"+ user);
    }
}
