<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>form</title>
</head>
<script>
function numCheck(r){
	var numC = document.boardForm.pwd;
	var flag= isNaN(numC.value);
	if(flag){
		alert("비밀번호에 숫자를 입력해주세요");
		numC.value="";
		numC.focus();
		return false;
	} 
	r.submit();
}
</script>
<body>
	<form action="<%=request.getContextPath()%>/BoardController?type=write" method="post" name="boardForm">
		<table border="1">
			<tr>
				<th>패스워드</th>
				<td><input type="text" name="pwd"></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><%=session.getAttribute("id") %></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea cols="45" rows="15" name="content"></textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="button" value="등록" onClick="numCheck(this.form)"></td>
			</tr>
		</table>
	</form>
</body>
</html>