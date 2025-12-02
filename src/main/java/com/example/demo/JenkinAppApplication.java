package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinAppApplication {
    @GetMapping("/jenkins")
    public String jenkins() {
        return " Checking Jenkins";
    }

	public static void main(String[] args) {
		SpringApplication.run(JenkinAppApplication.class, args);
	}

}
