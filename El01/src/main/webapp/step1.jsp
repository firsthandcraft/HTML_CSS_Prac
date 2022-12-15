<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>Hello JSP</h3>
	<!-- 주석 -->
	
	<!-- jspService() 내에 삽입되는 자바(여기서 선언된 변수는 모두 지역 변수(매소드 내에 존재하므로)) 
		주석도 자바처럼 나온다. 
	-->
	<% int i;
	   for(i=1;i<6;i++){
	%>
		<h<%=i %>>도비는 자유</h>
	<%} %>
	
	<% %>
</body>
</html>