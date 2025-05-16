package com.esi.hrservice.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {

    @Bean
    public NewTopic PhDAppResponseCreation() {
        return TopicBuilder.name("PhDAppResponseCreation")
                .build();
    }
}
