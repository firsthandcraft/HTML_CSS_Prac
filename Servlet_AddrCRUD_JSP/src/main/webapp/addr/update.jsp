<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import="AddrDao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>update</title>
</head>
<body>
<% Member p = (Member)request.getAttribute("p");%>
<form action="<%=request.getContextPath() %>/control?num=<%=p.getNum() %>" method="post">
		<input type="hidden" name="type"value="edit">
		
		�̸� : <input type="text" name="name" value="<%=p.getName() %>"> <br/>
		��ȭ��ȣ :  <input type="text" name="tel" value="<%=p.getTel() %>"> <br/>
		�ּ� : <input type="text" name="addr" value="<%=p.getAddress() %>"> <br/>
		�����ȣ : <input type="text" name="postal" value="<%=p.getPostal() %>"> <br/>
		<input type="submit" value="����">
	</form>
</body>
</html>