<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원가입</title>
</head>
<body>
	<h3>회원가입</h3>
	<h4>회원가입만</h4>
	<form action="/ch7/JoinController" method="post">
		<label>아이디 : <input type="text" name="id"></label>
		<label>비밀번호 : <input  type="password" name="pwd"></label>
		<label>이름 : <input  type="text" name="name"></label>
		<label>메일 : <input  type="email" name="email"></label>
		<input type="reset" value="취소">	
		<input type="submit" value="가입">	
	</form>
</body>
</html>