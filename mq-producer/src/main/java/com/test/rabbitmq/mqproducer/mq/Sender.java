package com.test.rabbitmq.mqproducer.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Value("${mq.config.exchange}")
    private String exchange;

    @Value("${mq.config.queue.info.routing.key}")
    private String routingKey;

    /**
     * 发送消息
     * @param msg
     */
    public void send(String msg){
        System.out.println("send:"+msg);
        System.out.println(exchange+"--"+routingKey);
        amqpTemplate.convertAndSend(this.exchange,this.routingKey,msg);
    }
}
