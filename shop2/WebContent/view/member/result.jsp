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

${sessionScope.m.name}님 어서오세요
<a href="${pageContext.request.contextPath}/SearchController">회원 정보 수정</a>
<a href="${pageContext.request.contextPath}/LogoutController">로그아웃</a>
<a href="${pageContext.request.contextPath}/DelController">탈퇴하기</a>
<c:choose>
<c:when test="${m.type==1}"><a href="${pageContext.request.contextPath}/seller/List">판매자 쇼핑몰</a></c:when>
<c:otherwise><a href="${pageContext.request.contextPath}/order/List">구매자 쇼핑몰</a></c:otherwise>
</c:choose>

	
</c:if>
<c:if test="${empty sessionScope.id}">
		로그인 실패
		<a href="${pageContext.request.contextPath}/view/member/loginForm.jsp">로그인화면으로 돌아가기</a>
</c:if>

</body>
</html>