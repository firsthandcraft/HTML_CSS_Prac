<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>result</title>
</head>
<body>
<h5>result</h5>
<c:if test="${not empty sessionScope.id }">

${sessionScope.m.name}�� �������
<a href="${pageContext.request.contextPath}/SearchController">ȸ�� ���� ����</a>
<a href="${pageContext.request.contextPath}/LogoutController">�α׾ƿ�</a>
<a href="${pageContext.request.contextPath}/DelController">Ż���ϱ�</a>
<c:choose>
<c:when test="${m.type==1}"><a href="${pageContext.request.contextPath}/seller/List">�Ǹ��� ���θ�</a></c:when>
<c:otherwise><a href="${pageContext.request.contextPath}/order/List">������ ���θ�</a></c:otherwise>
</c:choose>

	
</c:if>
<c:if test="${empty sessionScope.id}">
		�α��� ����
		<a href="${pageContext.request.contextPath}/view/member/loginForm.jsp">�α���ȭ������ ���ư���</a>
</c:if>

</body>
</html>