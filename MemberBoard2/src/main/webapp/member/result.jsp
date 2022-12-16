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
		<h3>list</h3>
	<c:if test="${not empty list}">
		<table border="1">
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>작성자</th>
			</tr>
			<c:forEach var="b" items="${list}">
			<tr>
				<td>${b.num}</td>
				<td><a href="${pageContext.request.contextPath}/ReadController?num=${b.num}">${b.title}</a></td>
				<td>${b.writer}</td>
			</tr>
			</c:forEach>
		</table>
	
	</c:if>
	<c:if test="${empty list}">
		작성된 글이 없습니다.
	</c:if>

	<a href="${pageContext.request.contextPath}/board/form.jsp">글작성</a>
	</c:if>
	<c:if test="${empty sessionScope.id}">
		로그인 실패
		<a href="${pageContext.request.contextPath}/member/loginForm.jsp">로그인화면으로 돌아가기</a>
	</c:if>
</body>
</html>