<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="model.Member,java.util.HashMap"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>step3</title>
</head>
<body>
<h3>회원정보</h3>
<h4>el로 출력</h4>
<h5>servlet에서 실행</h5>
<b>id:</b> ${my.id}<br>
<b>pwd:</b> ${my.pwd}<br>
<b>name:</b> ${my.name}<br>
<b>email:</b> ${my.email}



<hr>
</body>
</html>