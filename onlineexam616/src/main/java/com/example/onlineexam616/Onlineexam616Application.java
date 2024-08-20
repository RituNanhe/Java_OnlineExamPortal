package com.example.onlineexam616;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com")
public class Onlineexam616Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Onlineexam616Application.class, args);
		
		System.out.println("Starting");
	}

}
