<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>loginform</title>
</head>
<body>
	<h3>로그인</h3>
	<form action="${pageContext.request.contextPath}/LoginController" method="post">
		<label>id : <input type="text" name="id"></label>
		<label>pwd : <input type="password" name="pwd"></label>
		<input type="submit" value="로그인">
	</form>
	<a href="${pageContext.request.contextPath}/member/form.jsp">회원가입</a>
</body>
</html>