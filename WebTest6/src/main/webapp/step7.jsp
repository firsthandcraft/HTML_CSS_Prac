<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="model.MemberVO"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- ������ �� ����ϱ� -->
	<% MemberVO vo= new MemberVO("java","1234","������","�Ǳ�");%>
	<%
		if(vo.getId().equals("java")&& vo.getPassword().equals("1234")){
	%>
		ȸ�� ���̵� : <%=vo.getId() %>
		ȸ�� �̸� : <%=vo.getName() %>
		ȸ�� �ּ� :  <%=vo.getAddress() %>
	<%}else{%>
		ȸ���� �ƴϴ�.
	<%}%>
	
	
</body>
</html>