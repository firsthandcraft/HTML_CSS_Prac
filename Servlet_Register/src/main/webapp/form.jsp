<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ȸ������</title>
</head>
<body>
	<h3>ȸ������</h3>
	<h4>ȸ�����Ը�</h4>
	<form action="/ch7/JoinController" method="post">
		<label>���̵� : <input type="text" name="id"></label>
		<label>��й�ȣ : <input  type="password" name="pwd"></label>
		<label>�̸� : <input  type="text" name="name"></label>
		<label>���� : <input  type="email" name="email"></label>
		<input type="reset" value="���">	
		<input type="submit" value="����">	
	</form>
</body>
</html>