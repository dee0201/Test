package com.journaldev.struts2.action;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.apache.struts2.result.ServletRedirectResult;
import org.apache.struts2.util.ServletContextAware;

import com.journaldev.struts2.bean.FileUploadRequest;
import com.journaldev.struts2.object.FileUploadObject;
import com.journaldev.struts2.util.FileUploadUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Result;

public class fffFileUpload extends ActionSupport implements ModelDriven<FileUploadRequest>, ServletContextAware {
	private static final long serialVersionUID = 1L;

	FileUploadRequest fileUploadRequest = new FileUploadRequest();
	@Override
	public FileUploadRequest getModel()
	{
		return fileUploadRequest;
	}
	@Override
	public void setServletContext(ServletContext context) {
		getModel().context = context;
	}
	
    public String execute() {
        runAction();
        return INPUT;
    } 
	
	public Result runAction()
	{
		ServletRedirectResult result = new ServletRedirectResult();
		FileUploadObject fileUploadObject = new FileUploadObject();
		Boolean response = fileUploadObject.ProcessFileUpload(fileUploadRequest);
		System.out.println("File Name is:"+  fileUploadRequest.getFileFileName());
		System.out.println("File ContentType is:"+  getModel().getFileContentType());
		System.out.println("Files Directory is:"+  getModel().filesPath);
		
		try {
			FileUploadUtil.saveFile( getModel().getFile(),  getModel().getFileFileName(),  getModel().context.getRealPath("") + File.separator +  getModel().filesPath);
		} catch (IOException e) {
			e.printStackTrace();
			result.setLocation("/FileUpload.jsp");
		}

		if (response == true ) 
		{
			result.setLocation("/FileUpload.jsp");
		} else 
		{
			result.setLocation("ErrorPage.jsp");
		}	
		return result;
	}
}
