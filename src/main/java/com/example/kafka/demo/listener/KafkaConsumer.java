package com.example.kafka.demo.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.kafka.demo.model.User;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "Kafka_Example", groupId = "group_id")
	public void consume(String message) {
		System.out.println("Consumed Message : " + message);
	}
	
	@KafkaListener(topics =  "Kafka_Example_json" , groupId = "group_json" , containerFactory ="userKafkaConsumerFactory")
	public void consumeJson(User user)
	{
		System.out.println("Consumed Message : " + user.getName()+ " , "+ user.getDepartment() );
	}
	
	
}

