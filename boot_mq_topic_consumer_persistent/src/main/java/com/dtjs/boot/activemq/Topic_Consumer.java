package com.dtjs.boot.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Component
public class Topic_Consumer {

    @JmsListener(destination ="${myTopicName}",containerFactory = "jmsListenerContainerFactory")
    public void getMessage(TextMessage textMessage) throws JMSException {
        System.out.println("订阅着收到消息:    " + textMessage.getText());
    }
}
 
 
