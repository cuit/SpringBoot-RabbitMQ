package com.example.rabbitmqlistener.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author: xiashichao
 * @date: 2018/4/9 下午4:31
 * @description:
 */
@Component
public class Listener {

    @RabbitListener(queues = "topic_message_1")
    public void listen(String msg){
        System.out.println("打印出:"+msg);
    }
}
