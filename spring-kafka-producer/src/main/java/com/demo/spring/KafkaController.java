package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class KafkaController {
    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    @GetMapping(path="send",produces = "text/plain")
    public ResponseEntity<String> send(@RequestParam("message") String message){
        kafkaTemplate.send("demo-topic",message);
        return ResponseEntity.ok("Message sent...");
    }
}
