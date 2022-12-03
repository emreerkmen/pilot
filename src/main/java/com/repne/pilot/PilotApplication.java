package com.repne.pilot;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;

@SpringBootApplication
public class PilotApplication {

    public static void main(String[] args) {
        SpringApplication.run(PilotApplication.class, args);
    }

    @Bean
    public NewTopic topic() {
        return TopicBuilder.name("topic-country")
                .partitions(10)
                .replicas(1)
                .build();
    }

    @KafkaListener(id = "myId", topics = "topic-country")
    public void listen(String in) {
        System.out.println(in);
    }

}
