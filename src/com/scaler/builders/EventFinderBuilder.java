package com.scaler.builders;

import java.util.ArrayList;
import java.util.List;

import com.scaler.search.*;

public class EventFinderBuilder {
	public List<EventFinder> build()
	{
		List<EventFinder> eventFinder = new ArrayList<EventFinder>();
		eventFinder.add(new EventFinderWithTitle());
		eventFinder.add(new EventFinderWithGenre());
		eventFinder.add(new EventFinderWithLanguage());
		return eventFinder;
	}
}
