package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import java.util.logging.Logger;

@EnableBinding(Sink.class)
@SpringBootApplication
public class KafkaConsumerApplication {

	private final Logger logger= Logger.getLogger(KafkaConsumerApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerApplication.class, args);
	}

	@StreamListener("input")
	public void consumeMessage(Book book){
		logger.info(book.toString());
	}

}
