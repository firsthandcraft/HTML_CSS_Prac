<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script>
function nullCheck(){
	if(f.id.value=="" || f.pwd.value=="" || f.name.value==""||f.email.value==""||f.addr.value==""){
		alert("������ �Է��ϼ���.");
		//f.name.focus();
		return false;
	}
	f.submit();
}
</script>
</head>
<body>
<h3>ȸ������</h3>
	<form name="f" action="${pageContext.request.contextPath}/JoinController" method="post">
		<table>
			<tr>
				<td><input type="text" name="id" placeholder="id"></td>
			</tr>
			<tr>
				<td><input type="password" name="pwd" placeholder="pwd"></td>
			</tr>
			<tr>
				<td><input type="text" name="name" placeholder="name"></td>
			</tr>
			<tr>
				<td><input type="email" name="email" placeholder="email"></td>
			</tr>
			<tr>
				<td><input type="text" name="addr" placeholder="address"></td>
			</tr>
			<tr>
				<td>
					<label>�Ǹ���<input type="radio" name="type" value="1" checked></label>
					<label>������<input type="radio" name="type" value="2"></label>
				</td>
			</tr>
			<tr colspan="2">
				<td><input type="button" value="ȸ������" onClick="nullCheck(this.form)"></td>
			</tr>
		
		</table>
	</form>
	<a href="${pageContext.request.contextPath}/view/member/loginForm.jsp">�α���</a>
</body>
</html>