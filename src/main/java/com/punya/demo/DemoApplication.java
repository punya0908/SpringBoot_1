package com.punya.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Student student = new Student("Rohan", 27);

		System.out.println(student.getName());
		System.out.println(student.getAge());
	}

}
