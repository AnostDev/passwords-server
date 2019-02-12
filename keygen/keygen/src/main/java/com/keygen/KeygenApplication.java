package com.keygen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KeygenApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeygenApplication.class, args);
		//((AnnotationConfigApplicationContext) context).registerShutdownHook();
	}

}

