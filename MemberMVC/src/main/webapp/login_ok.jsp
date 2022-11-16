<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.MemberVO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>loginok</title>
</head>
<body>
	
<c:choose>
	<c:when test="${sessionScope.mvo==null}">
	<script>
		alert("로그인하세요");
		location.href="login,jsp";
	</script>
	</c:when>
	<c:otherwise>
		${sessionScope.mvo.name}님 로그인 상태..<br><br>
		<a href="cafe.jsp">카페</a>
		<a href="index.jsp">index</a>
	</c:otherwise>
</c:choose>

</body>
</html>












