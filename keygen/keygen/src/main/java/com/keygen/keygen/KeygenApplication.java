package com.keygen.keygen;

import com.keygen.keygen.test.HelloWorld;
import com.keygen.keygen.test.HelloWorldConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class KeygenApplication {

	public static void main(String[] args) {
		//SpringApplication.run(KeygenApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloWorld = (HelloWorld) context.getBean(HelloWorld.class);
		helloWorld.getMessage();

		((AnnotationConfigApplicationContext) context).registerShutdownHook();
	}

}

