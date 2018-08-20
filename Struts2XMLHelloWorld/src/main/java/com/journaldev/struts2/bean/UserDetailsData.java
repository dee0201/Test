package com.journaldev.struts2.bean;

import java.util.List;

public class UserDetailsData {
	public List<UserDetailsData> RecordList;
	public String Name;
	public String Gender;
	public List<String> Address;
	
	public String getName()
	{
		return Name;
	}
	
	public String getGender()
	{
		return Gender;
	}
	
	public List<String> getAddress()
	{
		return Address;
	}
	
	public List<UserDetailsData> getUserDetailsData()
	{
		return RecordList;
	}
	
	public void setName(String Name)
	{
		this.Name = Name;
	}
	
	public void setGender(String Gender)
	{
		this.Gender = Gender;
	}
	
	public void setAddress(List<String> Address)
	{
		this.Address = Address;
	}
	
	public void setUserDetailsData(List<UserDetailsData> RecordList)
	{
		this.RecordList = RecordList;
	}
}
