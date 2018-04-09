package com.example.springbootrabbitmq.mq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: xiashichao
 * @date: 2018/4/9 上午10:43
 * @description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SenderTest {

    @Autowired
    private Sender sender;

    @Test
    public void test() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            sender.send("exchange", "topic_message_1", "这是" + i + "个故事！！！");
            Thread.sleep(3000);
        }
    }
}
