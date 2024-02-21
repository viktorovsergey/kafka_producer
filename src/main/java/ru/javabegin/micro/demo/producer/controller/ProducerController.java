package ru.javabegin.micro.demo.producer.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.javabegin.micro.demo.producer.dto.User;
import ru.javabegin.micro.demo.producer.service.KafkaService;

import java.util.UUID;

@RestController
@RequiredArgsConstructor

public class ProducerController {

    private final KafkaService kafkaService;


    @PostMapping("/send")
    public String sendMassege(@RequestBody User dto) throws JsonProcessingException {
        return kafkaService.sendMessage(dto);
    }
}
