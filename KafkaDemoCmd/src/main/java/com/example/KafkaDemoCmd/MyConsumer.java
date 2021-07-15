package com.example.KafkaDemoCmd;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MyConsumer {

		
		@KafkaListener(topics = "mytopic", groupId = "mygroup")
		public void consumerFromTopic(String msg) {
			System.out.println(msg);
		}


}
