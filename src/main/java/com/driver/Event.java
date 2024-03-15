package com.driver;

public class Event {
	private String eventType; // e.g., wedding, corporate, casual
    private String languageRequired;
    private int duration;

    // Constructor
    public Event(String eventType, String languageRequired, int duration) {
    	// your code goes here
    }

    // Getters and Setters
    public String getEventType() {
    	// your code goes here
        return eventType;
    }

    public void setEventType(String eventType) {
    	// your code goes here
    }

    public String getLanguageRequired() {
    	// your code goes here
        return languageRequired;
    }

    public void setLanguageRequired(String languageRequired) {
    	// your code goes here
    }

    public int getDuration() {
    	// your code goes here
        return duration;
    }

    public void setDuration(int duration) {
    	// your code goes here
    }
}
