package com.example.poll_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PollProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PollProjectApplication.class, args);
	}

}
