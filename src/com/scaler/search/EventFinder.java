package com.scaler.search;

import java.util.List;

import com.scaler.models.Event;
import com.scaler.models.Filter;

public abstract class EventFinder {
	abstract public List<Event> fetchEvents(Filter filter, List<Event> eventList);
}
