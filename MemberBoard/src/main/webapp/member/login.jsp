<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>login</title>
</head>
<body>
<h3>�α���</h3>
<form name="f" action="<%=request.getContextPath()%>/Controller?type=login" method="post">
	<table border="1">
		<tr>
			<td>���̵�</td>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<td>��й�ȣ</td>
			<td ><input type="password" name="pwd"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="�α���"></td>
		</tr>
	</table>
	<a href="<%=request.getContextPath()%>/member/form.jsp">ȸ������</a>
</form>
</body>
</html>