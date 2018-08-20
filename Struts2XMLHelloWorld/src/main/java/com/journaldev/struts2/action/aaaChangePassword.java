package com.journaldev.struts2.action;

import org.apache.struts2.result.ServletDispatcherResult;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Result;

public class aaaChangePassword extends ActionSupport implements Action{

	private static final long serialVersionUID = 1L;

	public String execute() 
	{
		return "";			
	}
	
	public Result runAction() {
		ServletDispatcherResult result = new ServletDispatcherResult();
		 
		result.setLocation("/ChangePassword.jsp");
		return result;
	}
}
