<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�α��� ���ȭ��</title>
</head>
<body>
	<h3>�޴�</h3>
	<!-- ���������� ������ �������� ��� -->
	<c:if test="${not empty sessionScope.id}">
	${sessionScope.m.name}�� �α���
	
		<a href="${pageContext.request.contextPath}/SearchController">����������</a><br>
		<a href="${pageContext.request.contextPath}/LogoutController">�α׾ƿ�</a><br>
		<a href="${pageContext.request.contextPath}/DelController">Ż��</a><br>
	<c:redirect url="/ListController"></c:redirect>
	
	</c:if>
	<c:if test="${empty sessionScope.id}">
		�α��� ����
		<a href="${pageContext.request.contextPath}/member/loginForm.jsp">�α���ȭ������ ���ư���</a>
	</c:if>
</body>
</html>