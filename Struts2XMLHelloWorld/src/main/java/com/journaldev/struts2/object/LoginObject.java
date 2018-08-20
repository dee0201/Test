package com.journaldev.struts2.object;

import javax.servlet.http.HttpServletRequest;

public class LoginObject {
	public Boolean ValidateLogin(HttpServletRequest request)
	{
		if (request.getParameter("name").equals("dee") && request.getParameter("pwd").equals("dee"))
		{
			return true;
		}
		return false;
	}
}
