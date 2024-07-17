package com.college.system.CollegeOnlineSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com")
@EntityScan("com")
@SpringBootApplication
public class CollegeOnlineSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollegeOnlineSystemApplication.class, args);
	}

}
