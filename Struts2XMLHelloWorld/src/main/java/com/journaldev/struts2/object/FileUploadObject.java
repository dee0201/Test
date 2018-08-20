package com.journaldev.struts2.object;

import com.journaldev.struts2.bean.FileUploadRequest;
import com.opensymphony.xwork2.ActionSupport;

public class FileUploadObject extends ActionSupport {
	private static final long serialVersionUID = 1L;

	public Boolean ProcessFileUpload(FileUploadRequest request)
	{
		/*
		Boolean response;
		if (request.getUploadType().equals("Large"))
		{
			response = ProcessLargeFile(request);
		} else 
		{
			response = ProcessSmallFile(request);
		}
		*/
		return true;
		
	}
}
