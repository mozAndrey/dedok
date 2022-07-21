package com.example.dedok.rabbit;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.logging.Logger;

@Component
@Slf4j
public class RabbitMqListener {
    Logger logger = Logger.getLogger(String.valueOf(RabbitMqListener.class));
    Random random = new Random();

    @RabbitListener(queues = "query-example-3")
    public void worker1(String message) {
        logger.info("accepted on worker 1 : " + message);
    }

}