package com.example.springbootrabbitmq.mq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author: xiashichao
 * @date: 2018/4/9 上午10:40
 * @description:
 */
@Component
public class Listener {

    /*@RabbitListener(queues = "topic_message_1")
    public void receiver(String s) {
        System.out.println("接受：" + s);
    }*/
}
