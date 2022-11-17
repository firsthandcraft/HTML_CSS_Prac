<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>로그인 결과화면</title>
</head>
<body>
	<h3>메뉴</h3>
	<!-- 정상적으로 세션을 가져왔을 경우 -->
	<c:if test="${not empty sessionScope.id}">
	${sessionScope.m.name}님 로그인
	
		<a href="${pageContext.request.contextPath}/SearchController">내정보수정</a><br>
		<a href="${pageContext.request.contextPath}/LogoutController">로그아웃</a><br>
		<a href="${pageContext.request.contextPath}/DelController">탈퇴</a><br>
	<c:redirect url="/ListController"></c:redirect>
	
	</c:if>
	<c:if test="${empty sessionScope.id}">
		로그인 실패
		<a href="${pageContext.request.contextPath}/member/loginForm.jsp">로그인화면으로 돌아가기</a>
	</c:if>
</body>
</html>