package com.professionalit.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.professionalit.producer.OrderProducer;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderProducer producer;


    public OrderController(OrderProducer producer) {
        this.producer = producer;
    }


    @PostMapping
    public String createOrder(
            @RequestBody String order
    ){

        producer.sendOrder(order);

        return "Order Created";
    }
}