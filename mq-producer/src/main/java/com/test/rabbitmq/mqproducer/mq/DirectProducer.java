package com.test.rabbitmq.mqproducer.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DirectProducer {

    @Autowired
    AmqpTemplate amqpTemplate;

    public void produceMsg_01(){
        amqpTemplate.convertAndSend(DirectQueue.TEST_01,"hello from test_01");
    }

    public void produceMsg_02(){
        amqpTemplate.convertAndSend(DirectQueue.TEST_02,"hello from test_02");
    }
}
