<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- 메뉴지정 -->
	<a href="/insert.jsp">상품등록</a><br/>
	<a href="<%=request.getContextPath()%>/control?type=list">전체상품출력</a><br/>
	<a href ="list.jsp">상품검색</a>
	
</body>
</html>