<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>join</title>
</head>
<body>
	<h3>ȸ������</h3>
	
	<form action="${pageContext.request.contextPath}/JoinController" method="post">
		<input type="text" name="id" placeholder="id"><br>
		<input type="password" name="pwd" placeholder="pwd"><br>
		<input type="text" name="name" placeholder="name"><br>
		<input type="email" name="email" placeholder="email"><br>
		<input type="reset" value="���">
		<input type="submit" value="����"><br>
	</form>
	<a href="${pageContext.request.contextPath}/member/loginForm.jsp">�α���</a>
</body>
</html>



