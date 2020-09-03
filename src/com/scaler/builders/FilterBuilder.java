package com.scaler.builders;

import com.google.gson.Gson;
import com.scaler.exceptions.BadFilterStringException;
import com.scaler.models.Filter;

public class FilterBuilder {
	public Filter build(String filterString) throws BadFilterStringException
	{
		Gson gson = new Gson();	
		Filter filterObject = new Filter();
		try 
		{
			filterObject = gson.fromJson(filterString, Filter.class);
		}
		catch (Exception e)
		{
			throw new BadFilterStringException("Filter string is not in proper format");
		}
		
		return filterObject;
	}
}
