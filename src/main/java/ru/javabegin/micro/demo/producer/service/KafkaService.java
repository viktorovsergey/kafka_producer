package ru.javabegin.micro.demo.producer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import ru.javabegin.micro.demo.producer.dto.User;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaService {
    private final KafkaTemplate<String, User> kafkaTemplate;

    public String sendMessage(User dto) throws JsonProcessingException {
          kafkaTemplate.send("test", UUID.randomUUID().toString(),dto);
        log.info("Kafka message send: {}", dto.toString());
        return dto.toString();
    }
}
