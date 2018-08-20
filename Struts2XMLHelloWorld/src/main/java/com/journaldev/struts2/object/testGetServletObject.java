package com.journaldev.struts2.object;

import javax.servlet.http.HttpServletRequest;

public class testGetServletObject {
	public String TestFunction(HttpServletRequest request)
	{
		String param = request.getParameter("aaa");
		if (param.equals("a") == true)
		{
			System.out.println("print out at object");
			return "/TestServletJSP.jsp";
		} else 
		{
			return "b";
		}
	}
}
