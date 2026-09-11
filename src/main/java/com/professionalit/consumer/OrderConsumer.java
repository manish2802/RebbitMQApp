package com.professionalit.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
	@RabbitListener(queues = "order.queue")
	public void consume(String message) {
		System.out.println("Message Received : " + message);
	}
}