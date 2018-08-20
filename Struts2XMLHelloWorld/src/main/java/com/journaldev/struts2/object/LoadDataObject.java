package com.journaldev.struts2.object;

import java.util.*;

import com.journaldev.struts2.bean.LoadDataResponse;

public class LoadDataObject {
	public void setData(LoadDataResponse response)
	{
		List<String> address = new ArrayList<String>();
		address.add("19");
		address.add("Jalan Maharajalela");
		address.add("Cheras 43200");
		address.add("Selangor");
		address.add("Malaysia");
		
		response.setName("Test Response Data");
		response.setAddress(address);
	}
}
