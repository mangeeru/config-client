package com.micro.service.config.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.service.config.client.config.KafkaProperties;

@RestController
public class AppController {
	
	@Autowired
	private Environment env;
	
	@Autowired
	private KafkaProperties props;
	
	@GetMapping("/properties")
	public ResponseEntity<?> getProperties(){
		System.out.println("Message:"+env.getProperty("user.message"));
		System.out.println("Kafka Properties:"+env.getProperty("kafka.uri") +" "+props.getKafka_uri());
		StringBuilder sb = new StringBuilder("Properties").append("\n");
		sb.append("Kafka URI:").append(props.getKafka_uri()).append("\n");
		sb.append("Kafka Topic:").append(props.getKafka_topic());
		return new ResponseEntity<>(sb.toString() ,HttpStatus.OK);
	}

}
