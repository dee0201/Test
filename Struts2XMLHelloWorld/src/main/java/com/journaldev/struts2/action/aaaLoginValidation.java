package com.journaldev.struts2.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.result.ServletDispatcherResult;
import org.apache.struts2.result.ServletRedirectResult;

import com.journaldev.struts2.bean.LoginRequest;
import com.journaldev.struts2.object.LoginObject;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Result;

public class aaaLoginValidation extends ActionSupport implements ServletRequestAware
{
	private static final long serialVersionUID = 1L;
	HttpServletRequest request;
	
	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
	}

	public Result runAction()
	{
		LoginObject aaa = new LoginObject();
		Boolean response = aaa.ValidateLogin(request);
	
		ServletDispatcherResult result = new ServletDispatcherResult();	
		
		if (response)
		{
			//result.addParameter("user", request.getParameter("name"));
			result.setLocation("/Dashboard.jsp");	
			//result.
		} else 
		{
			//result.setAnchor(ERROR);
			result.setLocation("/error.jsp");
		}
		
		return result;
	}




}
