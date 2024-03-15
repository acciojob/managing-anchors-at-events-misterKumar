package com.driver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ManagingAnchorsAtEventsSolutionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagingAnchorsAtEventsSolutionApplication.class, args);
	}
	
	@Bean
    public CommandLineRunner commandLineRunner(EventMasterApp eventMasterApp) {
		// your code goes here
		return null;
    }

}
