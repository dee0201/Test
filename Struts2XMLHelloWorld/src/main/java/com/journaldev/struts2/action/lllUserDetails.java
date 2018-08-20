package com.journaldev.struts2.action;

import org.apache.struts2.result.ServletDispatcherResult;
import org.apache.struts2.result.ServletRedirectResult;

import com.journaldev.struts2.bean.UserDetailsData;
import com.journaldev.struts2.object.UserDetailsObject;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Result;

public class lllUserDetails extends ActionSupport implements ModelDriven<UserDetailsData> {
	private static final long serialVersionUID = 1L;
	UserDetailsData userDetailsData = new UserDetailsData();
	
	@Override
	public UserDetailsData getModel() {
		return userDetailsData;
	}
	
	public String execute()
	{
		UserDetailsObject userDetailsObject = new UserDetailsObject();
		userDetailsObject.setData(getModel());
		return "table";
	}
	
	public Result runAction()
	{
		
		//ServletDispatcherResult result = new ServletDispatcherResult();
		ServletRedirectResult result = new ServletRedirectResult();
		UserDetailsObject userDetailsObject = new UserDetailsObject();
		userDetailsObject.setData(getModel());
		result.setLocation("/UserDetailsTable.jsp");
		return result;
	}
	
}
