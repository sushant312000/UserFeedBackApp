package com.nissan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserFeedBackAppRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserFeedBackAppRestApiApplication.class, args);
		System.out.println("User feedback app is running");
	}

}
