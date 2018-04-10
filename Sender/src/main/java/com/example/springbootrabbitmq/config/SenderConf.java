package com.example.springbootrabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: xiashichao
 * @date: 2018/4/9 上午10:33
 * @description:
 */
@Configuration
public class SenderConf {

    @Bean(name = "message1")
    public Queue queueMessage1() {
        return new Queue("topic_message_1");
    }

    @Bean(name = "message2")
    public Queue queueMessage2(){
        return new Queue("topic_message_2");
    }

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange("exchange");
    }

    @Bean
    public Binding bindingExchangeMessage(@Qualifier(value = "message1") Queue queueMessage1, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessage1).to(exchange).with("topic_message_1");
    }

    @Bean
    public Binding bindingExchangeMessage2(@Qualifier(value = "message2") Queue queueMessage2, TopicExchange exchange){
        return BindingBuilder.bind(queueMessage2).to(exchange).with("topic_message_2");
    }
}
