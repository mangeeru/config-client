package com.micro.service.config.client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class KafkaProperties {
	
	@Value("${kafka.uri}")
	public String kafka_uri;
	
	@Value("${kafka.topic}")
	public String kafka_topic;

	public String getKafka_uri() {
		return kafka_uri;
	}

	public void setKafka_uri(String kafka_uri) {
		this.kafka_uri = kafka_uri;
	}

	public String getKafka_topic() {
		return kafka_topic;
	}

	public void setKafka_topic(String kafka_topic) {
		this.kafka_topic = kafka_topic;
	}


}
