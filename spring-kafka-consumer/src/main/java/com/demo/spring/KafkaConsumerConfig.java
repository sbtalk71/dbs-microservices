package com.demo.spring;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.HashMap;

@Configuration
@ComponentScan(basePackages = "com.demo.spring")
public class KafkaConsumerConfig {

    @Bean
    public ConsumerFactory<String,Emp> consumerFactory(){
        HashMap<String,Object> config=new HashMap<>();
        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        config.put(ConsumerConfig.GROUP_ID_CONFIG,"app3");
        config.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,"earliest");

        return new DefaultKafkaConsumerFactory<>(config);

    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String,Emp> kafkaListenerFactory(){
        ConcurrentKafkaListenerContainerFactory<String,Emp> lcf=new ConcurrentKafkaListenerContainerFactory<String,Emp>();
        lcf.setConsumerFactory(consumerFactory());
        return lcf;
    }
}
