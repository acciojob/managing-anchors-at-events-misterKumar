package com.driver;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventMasterApp {
	private final AnchorService anchorService;
    private final List<Anchor> anchors;

    @Autowired
    public EventMasterApp(AnchorService anchorService, List<Anchor> anchors) {
    	// your code goes here
    }

    public Anchor start(Event event) {
    	// your code goes here
        return anchorService.recommendAnchor(event, anchors);
    }

    // Added method to handle the case without any arguments
    public Anchor start() {
    	// your code goes here
        Event defaultEvent = new Event("corporate", "English", 2);
        return anchorService.recommendAnchor(defaultEvent, anchors);
    }
}
