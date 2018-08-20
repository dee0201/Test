package com.journaldev.struts2.bean;

public class LoginRequest {

	// Java Bean to hold the form parameters
	public LoginRequest() {
		this.getName();
		this.getPwd();
	}

	public String name;
	public String pwd;
	public String nxtPage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getNxtPage()
	{
		return this.nxtPage;
	}
	
	public void setNxtPage(String nxtPage)
	{
		this.nxtPage = nxtPage;
	}
}
