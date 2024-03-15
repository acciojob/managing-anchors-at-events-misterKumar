package com.driver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Anchor anchorJohn() {
    	// your code goes here
        return new Anchor("John", "English", "corporate", 3);
    }

    @Bean
    public Anchor anchorRiya() {
    	// your code goes here
        return new Anchor("Riya", "Hindi", "wedding", 5);
    }

    // Additional anchors can be added as beans
    @Bean
    public Anchor anchorJane() {
    	// your code goes here
        return new Anchor("Jane", "Spanish", "casual", 4);
    }
}
