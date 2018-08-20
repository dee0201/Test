package com.journaldev.struts2.bean;

public class LoginResponse {
	//Java Bean to hold the form parameters
	private String Response;
	private String Exception;

	public String getResponse() {
		return Response;
	}
	public void setResponse(String Response) {
		this.Response = Response;
	}

	public String getException() {
		return Exception;		
	}
	
	public void setException(String Exception) {
		this.Exception = Exception;		
	}
}