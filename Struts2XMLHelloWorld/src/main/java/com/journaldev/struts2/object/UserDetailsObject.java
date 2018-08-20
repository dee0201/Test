package com.journaldev.struts2.object;

import java.util.ArrayList;
import java.util.List;

import com.journaldev.struts2.bean.UserDetailsData;

public class UserDetailsObject {
	
	public void setData(UserDetailsData data)
	{
		List<UserDetailsData> recordList = new ArrayList<UserDetailsData>();
		for(int i = 0 ; i < 40 ; i++)
		{
			UserDetailsData test = new UserDetailsData();
			List<String> address = new ArrayList<String>();

			address.add("24"+ i);
			address.add("Street ");
			address.add("Taman ");
			address.add("Malaysia");
		
			test.setAddress(address);
			test.setGender("Male");
			test.setName("Steven Liew "+ i);
			recordList.add(test);
		}	
		data.setUserDetailsData(recordList);
	}
}
