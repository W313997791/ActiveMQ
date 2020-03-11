package com.dtjs.boot.activemq;

import org.apache.activemq.command.ActiveMQQueue;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Queue_Producer {
    //JmsMessagingTemplate是Springboot的Jms模板,Spring的是JmsTemplate
    private JmsMessagingTemplate jmsMessagingTemplate;

    //把ConfigBean类的ActiveMQQueue注入进来
    private ActiveMQQueue activeMQQueue;

    //发送Queue的方法
    public void producerMsg() {
        jmsMessagingTemplate.convertAndSend(activeMQQueue, "**************" + UUID.randomUUID().toString());
    }

    //构造注入对象(推荐)
    public Queue_Producer(JmsMessagingTemplate jmsMessagingTemplate, ActiveMQQueue activeMQQueue) {
        this.jmsMessagingTemplate = jmsMessagingTemplate;
        this.activeMQQueue = activeMQQueue;
    }

    //初始化5秒后执行，每3秒执行一次
    @Scheduled(initialDelay=5000, fixedDelay = 3000)
    public void message(){
        this.producerMsg();
        System.out.println("生产者生产消息");
    }
}
 
 
