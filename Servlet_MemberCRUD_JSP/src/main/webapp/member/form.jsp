<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Sign up</title>
</head>
<body>
<h3>Sign up</h3>
<form action="<%=request.getContextPath()%>/JoinController" method="post" >
	<label>id : <input type="text" name="id"></label><br/>
	<label>pwd :<input type="password" name="pwd"></label><br/>
	<label>name :<input type="text" name="name"></label><br/>
	<label>email :<input type="email" name="email"></label><br/>
	<input type="reset" name="���">
	<input type="submit" name="����">
</form>
<a href ="<%=request.getContextPath()%>/member/loginForm.jsp">�α���</a>
</body>
</html>