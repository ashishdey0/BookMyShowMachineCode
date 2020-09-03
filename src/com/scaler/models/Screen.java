package com.scaler.models;

import java.util.Arrays;

public class Screen {
	String screenId;
	Event event;
	boolean[][] layout;
	
	public Screen(int row, int col)
	{
		this.layout =  new boolean[row][col];
		for (boolean[] layoutRow: this.layout)
		    Arrays.fill(layoutRow, true);
	}
	
	void removeSeat(int row, int col)
	{
		this.layout[row][col] = false;
	}
	
	void addSeat(int row, int col)
	{
		this.layout[row][col] = true;
	}
	
	void addEvent(Event event)
	{
		this.event = event;
	}
	
	void removeEvent()
	{
		this.event = null;
	}
	
	boolean[][] fetchEventSeatLayout()
	{
		return this.layout;
	}
	
	boolean addLayout(boolean[][] layout) 
	{
		this.layout = layout;
		return true;
	}
}
