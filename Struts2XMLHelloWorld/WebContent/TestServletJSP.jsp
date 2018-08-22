<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action = "testGetServletRequest" method = "POST">
	<s:textfield name = "aaa" label = "test1"></s:textfield>
	<s:textfield name = "bbb" label = "test2"></s:textfield>
	<s:textfield name = "ccc" label = "test3"></s:textfield>
	<s:textfield name = "ddd" label = "test4"></s:textfield>
</s:form>
</body>
</html>