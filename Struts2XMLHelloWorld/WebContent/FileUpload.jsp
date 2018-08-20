<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- Using Struts2 Tags in JSP --%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 50%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}

input[type=text], select {
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
    background-color: #0000FF;
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
<title>File Upload</title>
</head>
<body>
<h3>Welcome to File Upload JSP file !</h3>
<s:form action="fffFileUpload" method="post" enctype="multipart/form-data">
    <s:file name="file" label="Less than 100 kb"/>
    <s:submit/>
</s:form>
<table>
<tr>
<th>File Name</th>
<th>Content Type</th>
<th>Path</th>
</tr>
<tr>
<td><s:property value = "getModel().fileFileName"></s:property></td>
<td><s:property value = "getModel().fileContentType"></s:property></td>
<td><s:property value = "getModel().filesPath"></s:property></td>
</tr>
</table>
</body>
</html>