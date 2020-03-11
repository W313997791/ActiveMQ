package com.dtjs.boot.activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootMqTopicConsumerNotPersistentApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootMqTopicConsumerNotPersistentApplication.class, args);
    }

}
