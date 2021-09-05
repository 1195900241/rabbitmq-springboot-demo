package com.gupaoedu.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author Mike
 * @date 2021/9/5 0005 15:51
 */
@Component
@RabbitListener(queues = "FIRST_QUEUE")
public class FirstConsumer {
    @RabbitHandler
    public void process(String msg){
        System.out.println(" first queue received msg : " + msg);
    }
}
