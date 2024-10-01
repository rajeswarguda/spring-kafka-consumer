package com.spring.kafka.consumer.spring_kafka_consumer.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "${message.topic.name}", groupId = "messageGroup", containerFactory = "messageKafkaListenerContainerFactory")
	public void listenGroupLongMessage(String message) {
		System.out.println("Received Message in group 'messageGroup'" + message);
	}

}
