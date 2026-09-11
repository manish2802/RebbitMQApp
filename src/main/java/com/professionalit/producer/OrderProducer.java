package com.professionalit.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer {
	private final RabbitTemplate rabbitTemplate;

	public OrderProducer(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

	public void sendOrder(String message) {
		rabbitTemplate.convertAndSend("order.queue", message);
		System.out.println("Message Sent : " + message);
	}
}