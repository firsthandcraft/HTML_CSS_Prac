<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="member.Member"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%Member m= (Member)request.getAttribute("m");%>

<form name="f" action="<%=request.getContextPath()%>/Controller?type=edit" method="post">
	<table border="1">
		<tr>
			<td>아이디</td>
			<td><input type="text" name="id" value="<%=m.getId()%>" readonly ></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td ><input type="password" name="pwd" value="<%=m.getPwd()%>" ></td>
		</tr>
		<tr>
			<td>이름</td>
			<td ><input type="text" name="name" value="<%=m.getName()%>" ></td>
		</tr>
		<tr>
			<td>이메일</td>
			<td ><input type="email" name="email" value="<%=m.getEmail()%>" ></td>
		</tr>
		<tr>
			<td><input type="reset" value="초기화"></td>
			<td><input type="submit" value="수정완료"></td>
		</tr>
	</table>
	<a href="<%=request.getContextPath()%>/member/ㅣlogin.jsp">로그인</a>
</form>


</body>
</html>