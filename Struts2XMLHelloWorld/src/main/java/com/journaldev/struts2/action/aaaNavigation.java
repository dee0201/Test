package com.journaldev.struts2.action;

import org.apache.struts2.result.ServletRedirectResult;

import com.journaldev.struts2.bean.NavigationRequest;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Result;

public class aaaNavigation extends ActionSupport implements ModelDriven<NavigationRequest>{

	private static final long serialVersionUID = 1L;

	NavigationRequest navigationRequest = new NavigationRequest();
	public NavigationRequest getModel()
	{
		return navigationRequest;
	}
	
	public Result runAction()
	{
		ServletRedirectResult result = new ServletRedirectResult();	
		result.setLocation(navigationRequest.getJspName()+".jsp");
		return result;
	}
}
