<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Load Bean to JSP sample</title>
</head>
<body>
<h2><s:property value = "getModel().Name"></s:property></h2>
<h2><s:property value = "getModel().Address"></s:property></h2>
</body>
</html>