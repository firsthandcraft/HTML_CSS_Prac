<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>ȸ������</h3>
<form name="f" action="<%=request.getContextPath()%>/Controller?type=join" method="post">
	<table border="1">
		<tr>
			<td>���̵�</td>
			<td><input type="text" name="id"  ></td>
		</tr>
		<tr>
			<td>��й�ȣ</td>
			<td ><input type="password" name="pwd"  ></td>
		</tr>
		<tr>
			<td>�̸�</td>
			<td ><input type="text" name="name"  ></td>
		</tr>
		<tr>
			<td>�̸���</td>
			<td ><input type="email" name="email"  ></td>
		</tr>
		<tr>
			<td><input type="reset" value="�ʱ�ȭ"></td>
			<td><input type="submit" value="���"></td>
		</tr>
	</table>
	<a href="<%=request.getContextPath()%>/member/��login.jsp">�α���</a>
</form>
</body>
</html>