<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%--jstl �ھ��±�  --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>index</title>
</head>
<body>
Model 2 MVC ȸ������ : JSTL�� �̿�<br><br>
<a href="find.jsp">ȸ���˻�</a>

<c:choose>
	<c:when test="${sessionScope.mvo==null}">
		<a href="login.jsp">�α���</a>
		<a href="register.jsp">ȸ������</a>
	</c:when>
	<c:otherwise>
		${sessionScope.mvo.name}�� �α��� ����..<br><br>
		<a href="update.jsp">ȸ������ ����</a>
	</c:otherwise>
</c:choose>
</body>
</html>