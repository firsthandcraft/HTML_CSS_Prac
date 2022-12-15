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
		
		이름 : <input type="text" name="name" value="<%=p.getName() %>"> <br/>
		전화번호 :  <input type="text" name="tel" value="<%=p.getTel() %>"> <br/>
		주소 : <input type="text" name="addr" value="<%=p.getAddress() %>"> <br/>
		우편번호 : <input type="text" name="postal" value="<%=p.getPostal() %>"> <br/>
		<input type="submit" value="수정">
	</form>
</body>
</html>