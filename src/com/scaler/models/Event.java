package com.scaler.models;

import java.util.ArrayList;
import java.util.List;

public class Event {
	String eventId;
	List<Screen> playingScreens;
	String title;
	String genre;
	String language;
	
	public Event(String eventId, String title, String genre, String language)
	{
		this.eventId = eventId;
		this.playingScreens = new ArrayList<Screen>();
	}
	
	void addScreen(Screen screen)
	{
		this.playingScreens.add(screen);
	}
	
	void removeScreen(String screenId)
	{
		this.playingScreens.removeIf(screen -> screen.screenId == screenId);
	}
}
