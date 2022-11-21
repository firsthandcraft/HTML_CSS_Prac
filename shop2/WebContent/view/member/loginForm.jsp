<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>login</title>
</head>
<body>
<h3>로그인</h3>
	<form name="f" action="${pageContext.request.contextPath}/LoginController" method="post">
		<table>
			<tr>
				<td><input type="text" name="id" placeholder="id"></td>
			</tr>
			<tr>
				<td><input type="password" name="pwd" placeholder="pwd"></td>
			</tr>
			<tr colspan="2">
				<td><input type="submit" value="로그인"></td>
			</tr>
		
		</table>
	</form>
	<a href="${pageContext.request.contextPath}/view/member/form.jsp">회원가입</a>
</body>

</body>
</html>