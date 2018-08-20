package com.journaldev.struts2.bean;

import java.util.List;

public class LoadDataResponse {
	
	public String Name;
	public List<String> Address;
	
	public String getName()
	{
		return Name;
	}
	
	public List<String> getAddress()
	{
		return Address;
	}
	
	public void setName(String Name)
	{
		this.Name = Name;
	}
	
	public void setAddress(List<String> Address)
	{
		this.Address = Address;
	}
	
}
