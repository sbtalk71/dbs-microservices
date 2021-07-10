package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaSender implements CommandLineRunner {
    @Autowired
    KafkaTemplate<String,Emp> kafkaTemplate;

    @Override
    public void run(String... args) throws Exception {
        Emp emp= new Emp(100,"Shantanu","Hyderabad",87000);
        kafkaTemplate.send("demo-topic",emp);
    }
}
