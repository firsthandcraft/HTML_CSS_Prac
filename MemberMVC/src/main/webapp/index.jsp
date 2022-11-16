<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%--jstl 코어태그  --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>index</title>
</head>
<body>
Model 2 MVC 회원관리 : JSTL을 이용<br><br>
<a href="find.jsp">회원검색</a>

<c:choose>
	<c:when test="${sessionScope.mvo==null}">
		<a href="login.jsp">로그인</a>
		<a href="register.jsp">회원가입</a>
	</c:when>
	<c:otherwise>
		${sessionScope.mvo.name}님 로그인 상태..<br><br>
		<a href="update.jsp">회원정보 수정</a>
	</c:otherwise>
</c:choose>
</body>
</html>