package com.dtjs.boot.activemq.beanConfig;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangshiyuan
 * @Date 2020/3/10 14:18
 */
@Configuration
public class ConfigBean {

    @Value("${myQueueName}")
    private  String QueueName;

    @Bean
    public ActiveMQQueue getActiveMQQueue(){
        return new ActiveMQQueue(QueueName);
    }
}
