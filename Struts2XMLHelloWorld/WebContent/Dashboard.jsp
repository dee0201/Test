<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- Using Struts2 Tags in JSP --%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<style>
input[type=submit] {
    width: 100%;
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
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Dashboard</title>
</head>
<body>
<h3>Welcome to Dashboard JSP file !</h3>
<s:form action = "NavigationToUserDetails">
	<s:submit value = "User Details"></s:submit>
</s:form>
<s:form action = "NavigationToFileUpload">
	<s:submit value = "File Upload"></s:submit>
</s:form>
<s:form action = "lllUserDetails">
	<s:submit value = "Load Data"></s:submit>
</s:form>

</body>
</html>