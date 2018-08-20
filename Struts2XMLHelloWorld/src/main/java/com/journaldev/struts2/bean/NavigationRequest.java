package com.journaldev.struts2.bean;

public class NavigationRequest {
	private String JspName;
	private String FileSize; 
	
	public void setJspName(String JspName)
	{
		this.JspName= JspName;
	}
	
	public String getJspName()
	{
		return this.JspName;
	}
	
	public void setFileSize(String fileSize)
	{
		this.FileSize = fileSize;
	}
	
	public String getFileSize()
	{
		return this.FileSize;
	}
}
