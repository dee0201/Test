package com.journaldev.struts2.bean;

import javax.servlet.ServletContext;
import java.io.File;

public class FileUploadRequest {
	public File file;
	public String fileContentType;
	public String fileFileName;
	public String filesPath;
	public ServletContext context;
	
	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	public String getFileFileName() {
		return fileFileName;
	}
	
	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public void setFilesPath(String filesPath) {
		this.filesPath = filesPath;
	}

	public void setServletContext(ServletContext ctx) {
		this.context=ctx;
	}

}
