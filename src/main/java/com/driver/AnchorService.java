package com.driver;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AnchorService {
	public Anchor recommendAnchor(Event event, List<Anchor> anchors) {
		// your code goes here
        if (event == null || anchors == null) {
            return null; // No suitable anchor found
        }

        for (Anchor anchor : anchors) {
            if (anchor.getType() != null && anchor.getType().equalsIgnoreCase(event.getEventType()) &&
                    anchor.getLanguageExpertise() != null && anchor.getLanguageExpertise().equalsIgnoreCase(event.getLanguageRequired()) &&
                    anchor.getMaxDuration() >= event.getDuration()) {
                return anchor;
            }
        }
        return null; // No suitable anchor found
    }
}
