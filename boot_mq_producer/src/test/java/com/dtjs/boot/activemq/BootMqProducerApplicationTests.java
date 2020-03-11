package com.dtjs.boot.activemq;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes = BootMqProducerApplicationTests.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
class BootMqProducerApplicationTests {

    @Test
    void contextLoads() {
    }


    @Autowired
    private Queue_Producer queue_producer;

    @Test
    public void testSend() {
        queue_producer.producerMsg();
    }
}
