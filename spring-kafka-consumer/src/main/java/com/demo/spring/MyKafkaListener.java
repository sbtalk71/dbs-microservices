package com.demo.spring;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MyKafkaListener {
    @KafkaListener(topics = "demo-topic",groupId = "app3")
    public void consume(String message){

        //System.out.println(e.getEmpId()+" "+e.getName()+" "+e.getCity());
        System.out.print(message);
    }
}
