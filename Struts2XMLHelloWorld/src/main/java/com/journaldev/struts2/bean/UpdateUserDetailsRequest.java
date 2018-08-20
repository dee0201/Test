package com.journaldev.struts2.bean;

import java.util.List;

public class UpdateUserDetailsRequest {
	
	public String fullName;
	public List<String> MultiSelections;
	
	public String getFullName()
	{
		return this.fullName;
	}
	
	public void setFullName(String fullName)
	{
		this.fullName = fullName;
	}
		
	public List<String> getMultiSelections()
	{
		return this.MultiSelections;
	}
	
	public void setMultiSelection(List<String> multiSelections)
	{
		this.MultiSelections = multiSelections;
	}
}
