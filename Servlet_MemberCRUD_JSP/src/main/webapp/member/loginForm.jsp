<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>login</title>
</head>
<body>
<h3>login</h3>
<form action="<%=request.getContextPath()%>/LoginController" method="post" >
	<label>id : <input type="text" name="id"></label><br/>
	<label>pwd :<input type="password" name="pwd"></label><br/>
	<input type="submit" name="�α���">
</form>
<a href ="<%=request.getContextPath()%>/member/form.jsp">ȸ������</a>
</body>
</html>