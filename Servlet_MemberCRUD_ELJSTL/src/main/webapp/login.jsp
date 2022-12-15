<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>login</title>
<script>
function loginCheck(){
	/*var f = document.loginForm;
	if(f.id.value=""){
		alert("아이디를 입력하세요!");
		return false;
	} else if(f.pass.value=""){
		alert("비밀번호를 입력하세요!");
		return false;
	}*/ 
}
</script>
</head>
<body>
<form action="<%=request.getContextPath()%>/LoginServlet" method="post" name="loginForm">
<!-- onsubmit= "return loginCheck()" -->
	<table border="1">
		<tr>
			<td>아이디</td>
			<td><input type="text" name="id" required></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="text" name="pwd" required></td>
		</tr>
		<tr>
			<td>전송</td>
			<td><input type="submit" value="로그인"></td>
		</tr>
	</table>
</form>
</body>
</html>