<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<style>
input, select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}
input[type=submit] {
    width: 50%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update User Details</title>
</head>
<body>
<s:form action = "aaaUpdateUserDetails" method= "POST">
	<s:textfield name="fullName" label="Full Name"></s:textfield>
	<s:textfield name = "MultiSelections" label = "selection 1"></s:textfield>
	<s:textfield name = "MultiSelections" label = "selection 2"></s:textfield>
	<s:textfield name = "MultiSelections" label = "selection 3"></s:textfield>
	<!-- % String[] MultiSelections = request.getParameterValues("MultiSelections"); %-->
	<s:submit value="Click"> To Json Response</s:submit>
</s:form>
</body>
</html>