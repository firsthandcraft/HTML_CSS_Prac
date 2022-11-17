<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="model.Member"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>memberInfo</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/EditController" method="post">
	id : <input type="text" name="id" value="${m.id}" readonly><br>
	pwd: <input type="text" name="pwd" value="${m.pwd}" ><br>
	name : <input type="text" name="name" value="${m.name}" ><br>
	email : <input type="text" name="email" value="${m.email}" ><br>
	<input type="reset" value="쵝화">
	<input type="submit" value="수정">
</form>
</body>
</html>