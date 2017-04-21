package com.edm;
import repository.*;
import model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class EdmStudyPathSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdmStudyPathSpringApplication.class, args);
	}
}
