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
		alert("���̵� �Է��ϼ���!");
		return false;
	} else if(f.pass.value=""){
		alert("��й�ȣ�� �Է��ϼ���!");
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
			<td>���̵�</td>
			<td><input type="text" name="id" required></td>
		</tr>
		<tr>
			<td>��й�ȣ</td>
			<td><input type="text" name="pwd" required></td>
		</tr>
		<tr>
			<td>����</td>
			<td><input type="submit" value="�α���"></td>
		</tr>
	</table>
</form>
</body>
</html>