package com.scaler.search;

import java.util.ArrayList;
import java.util.List;

import com.scaler.builders.EventFinderBuilder;
import com.scaler.builders.FilterBuilder;
import com.scaler.models.Event;
import com.scaler.models.Filter;

public class EventHandler {
	private List<Event> eventList;
	List<EventFinder> eventFinders;
	FilterBuilder filterBuilder;
	
	public EventHandler()
	{
		this.eventList = new ArrayList<Event>();
		this.eventFinders = new EventFinderBuilder().build();
		this.filterBuilder = new FilterBuilder();
	}
	
	public synchronized void addOrUpdateEvents(List<Event> events)
	{
		this.eventList.addAll(events);
	}
	
	public void removeEvents(List<String> ids)
	{
		
	}
	
	public void addEvents(List<Event> events)
	{
		this.eventList.addAll(events);
	}
	
	public List<Event> searchEvents(String filterString)
	{
		Filter filter;
		try 
		{
			filter = this.filterBuilder.build(filterString);
		}
		catch (Exception e)
		{
			return new ArrayList<Event>();
		}
		
		List<Event> res = new ArrayList<Event>();
		for (EventFinder ef : this.eventFinders)
		{
			res.addAll(ef.fetchEvents(filter, this.eventList));
		}
		
		return res;
	}
}
