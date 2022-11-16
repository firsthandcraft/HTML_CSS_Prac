<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="model.MemberVO"%>
<%--jstl 코어태그  --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>step99</title>
</head>
<body>
<h3>로그인 결과화면</h3>

 <c:set var="name" value="${param.userName}"></c:set>
 <c:set var="age" value="${param.userAge}"></c:set>

<c:choose>
	<c:when test="${age>18}">${name}님은 성인입니다.</c:when>
	<c:when test="${age>=14 && age<=18}">${name}님은 청소년입니다.</c:when>
	<c:otherwise>${name}님은 어린이입니다.</c:otherwise>
</c:choose>



</body>
</html>