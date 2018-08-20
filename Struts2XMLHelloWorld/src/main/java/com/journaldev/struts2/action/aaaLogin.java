package com.journaldev.struts2.action;

import org.apache.struts2.result.ServletRedirectResult;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Result;

public class aaaLogin extends ActionSupport {
	private static final long serialVersionUID = 1L;

	public Result runAction()
	{
		ServletRedirectResult result = new ServletRedirectResult();	
		result.setLocation("/login.jsp");
		return result;
	}
}
