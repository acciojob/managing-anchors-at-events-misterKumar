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
		return args -> {
			// You can handle user input here and then call the start method of EventMasterApp
			// For demonstration, let's assume default event
			Anchor recommendedAnchor = eventMasterApp.start();
			if (recommendedAnchor != null) {
				System.out.println("Recommended Anchor: " + recommendedAnchor.getName());
			} else {
				System.out.println("No suitable anchor found.");
			}
		};
    }

}
