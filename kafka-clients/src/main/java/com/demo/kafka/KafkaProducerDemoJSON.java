package com.demo.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class KafkaProducerDemoJSON {
    public static void main(String[] args) {

        Emp emp=new Emp(100,"Shantanu","Hyderabad",45000);

        Properties props=new Properties();
        props.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
        props.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class.getName());

        KafkaProducer<String, Emp> producer=new KafkaProducer<>(props);

        ProducerRecord<String,Emp> record=new ProducerRecord<>("demo-topic",emp);

        producer.send(record);
        producer.flush();
        producer.close();
        System.out.println("Message sent...");
    }
}
