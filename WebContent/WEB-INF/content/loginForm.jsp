<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>��¼</title>
</head>
<body>
<h1>��¼</h1>
<s:fielderror>
	<s:param>error</s:param>
</s:fielderror>
<s:form action="login">
	<s:textfield name="username" label="�˺�" />
	<s:password name="password" label="����" />
	<s:submit value="��¼" />
</s:form>
</body>
</html>