package com.crio.logdemo;

import com.crio.demolib.encoder.Encoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogdemoApplication.class, args);
		Encoder encoder = new Encoder();
		String encoded = encoder.encodeToBase64("Testing");
		System.out.println(encoded);
	}

}
