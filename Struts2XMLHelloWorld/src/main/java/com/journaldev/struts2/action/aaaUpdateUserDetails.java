package com.journaldev.struts2.action;

import org.apache.struts2.json.JSONResult;
import org.apache.struts2.result.*;

import com.google.gson.Gson;
import com.journaldev.struts2.bean.UpdateUserDetailsRequest;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Result;

public class aaaUpdateUserDetails implements ModelDriven<UpdateUserDetailsRequest> {

	UpdateUserDetailsRequest updateUserDetailsRequest = new UpdateUserDetailsRequest();
	
	public UpdateUserDetailsRequest getModel()
	{
		return updateUserDetailsRequest;
	}

	public Result runAction()
	{
		JSONResult result = new JSONResult();
		Gson gson = new Gson();
		result.equals(gson.toJson(getModel()));
		return result;
	}
}
