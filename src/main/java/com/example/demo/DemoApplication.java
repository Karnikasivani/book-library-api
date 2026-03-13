package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

}
//
//package com.example.demo; // Make sure this matches your actual package name!
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ConfigurableApplicationContext; // <--- THE KEY IMPORT
//
//@SpringBootApplication
//public class DemoApplication {
//
//	public static void main(String[] args) {
//		// SpringApplication.run returns the "context" (the container)
//		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//
//		// We ask that context to give us the bean
//		Switch mySwitch = context.getBean(Switch.class);
//
//		mySwitch.press();
//	}
//}