package com.journaldev.struts2.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.json.JSONResult;
import org.apache.struts2.result.ServletRedirectResult;

import com.google.gson.Gson;
import com.journaldev.struts2.object.testGetServletObject;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Result;

public class testGetServletRequest extends ActionSupport implements
ServletRequestAware  {
	
	private static final long serialVersionUID = 1L;
	protected HttpServletRequest request;

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
	}

	public HttpServletRequest getServletRequest() {
		return request;
	}
	
	public Result runAction()
	{
		ServletRedirectResult result = new ServletRedirectResult();
		testGetServletObject a = new testGetServletObject();
		result.setLocation(a.TestFunction(getServletRequest()));
		return result;
	}
}
