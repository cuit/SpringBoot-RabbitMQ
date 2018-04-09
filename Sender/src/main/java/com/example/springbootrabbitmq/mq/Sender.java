package com.example.springbootrabbitmq.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: xiashichao
 * @date: 2018/4/9 上午10:28
 * @description:
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(String s1, String s2, Object message) {
        amqpTemplate.convertAndSend(s1, s2, message);
    }
}
