package com.example.dedok.controller;

import com.example.dedok.DAO.DateWorkRepo;
import com.example.dedok.entity.DateWork;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@Slf4j
@RestController
public class DateWorkRest {
    Logger logger;

    private final DateWorkRepo repo;
    @Autowired
    RabbitTemplate template;

    @Autowired
    public DateWorkRest(DateWorkRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/allDates")
    public List<DateWork> findAll() {
        return repo.findAll();
    }

    @RequestMapping("/emit")
    @ResponseBody
    String queue1() {
        System.out.println("Emit to queue1");
        template.setExchange("exchange-example-3");
        template.convertAndSend("Fanout message");
        template.convertAndSend("query-example-3", "Message to queue");
        template.convertAndSend("query-example-3", "Message to queue  1");
        template.convertAndSend("query-example-2", "Message to queue    3");

        return "Emit to queue";
    }
}
