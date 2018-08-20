package com.journaldev.struts2.action;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;
import com.google.gson.Gson;
import com.journaldev.struts2.bean.LoginRequest;
import com.journaldev.struts2.bean.LoginResponse;
import com.opensymphony.xwork2.Action;

import io.swagger.annotations.*;

@Api(value = "/Login", description = "Operations about Login")
@Path("/login.action")
@Produces({"application/xml","application/json"})
public class LoginAction extends LoginRequest implements Action {
	//private static final long serialVersionUID = 1L;
	private String Data;
	public String getData()
	{
		return Data;	
	}
	
	
	private void setData(String jsonString)
	{
		this.Data = jsonString;		
	}

	public String execute() {
		LoginRequest request = new LoginRequest();
		request.setName(this.getName());
		request.setPwd(this.getPwd());
		String result = this.Login(request);
		this.Login2(request);
		return result;
	}
	
	@GET
	@ApiOperation(value = "API with GET method",position = 1)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid Input")})
	public String Login(@ApiParam(value = "Login", required = true) LoginRequest request) {

		LoginResponse loginResponse = new LoginResponse();
		if ("dee".equals(request.getName()) && "dee".equals(request.getPwd())) {
			loginResponse.setResponse("Welcome !");
			return "success";
		} else {
			loginResponse.setResponse("Please insert a valid user name !");
			return "failed";
		}

//		Gson gson = new Gson();
//		setData(gson.toJson(loginResponse));
		//return Response.ok().entity("").build();
	}
	
	@POST
	@ApiOperation(value = "API with POST method",position = 2)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid Input") })
	public Response Login2(@ApiParam(value = "Login", required = true) LoginRequest request) {

		LoginResponse loginResponse = new LoginResponse();
		if ("dee".equals(request.getName()) && "dee".equals(request.getPwd())) {
			loginResponse.setResponse("Welcome !");

		} else {
			loginResponse.setResponse("Please insert a valid user name !");

		}

		Gson gson = new Gson();
		setData(gson.toJson(loginResponse));
		return Response.ok().entity("").build();
	}
}
