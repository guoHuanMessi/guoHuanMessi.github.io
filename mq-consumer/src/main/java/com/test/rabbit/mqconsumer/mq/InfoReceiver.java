package com.test.rabbit.mqconsumer.mq;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @RabbitListener bindings: 绑定队列
 * @QueueBinding value :绑定队列的名称
 * @QUEUE   value :配置对列名称
 *          autoDelete:是否是一个可删除的临时队列
 *@Exchange   value ：交换机名
 *            type:指定交换器类型
 *
 *
 */
@Component
@RabbitListener(
        bindings = @QueueBinding(
                value = @Queue(value = "${mq.config.queue.info}",autoDelete = "true"),
                exchange = @Exchange(value = "${mq.config.exchange}",type= ExchangeTypes.DIRECT),
                key = "${mq.config.queue.info.routing.key}"
        )
)
public class InfoReceiver {

    @RabbitHandler
    public void processMsg(String msg){
        System.out.println("InfoReceiver:"+msg);
    }


}
