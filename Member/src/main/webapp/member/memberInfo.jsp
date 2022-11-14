<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page import="model.Member" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>memberInfo</title>
</head>
<body>
<h3>내정보 수정</h3>
	<% 
		Member m= (Member)request.getAttribute("m");
		
	%>
	<form action ="<%=request.getContextPath()%>/EditController" method="post" >
		<label>id : <input type="text" name="id" value="<%=m.getId()%>" readonly></label><br/>
		<label>pwd :<input type="password" name="pwd" value="<%=m.getPwd()%>"></label><br/>
		<label>name :<input type="text" name="name" value="<%=m.getName()%>"></label><br/>
		<label>email :<input type="email" name="email" value="<%=m.getEmail()%>"></label><br/>
		<input type="reset" value="취소">
		<input type="submit" value="수정">
	</form>
</body>
</html>