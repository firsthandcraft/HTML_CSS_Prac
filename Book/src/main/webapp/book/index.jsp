<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html >
<!-- PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>index</title>
</head>
<body>
<a href="<%=request.getContextPath() %>/book/insert.jsp">상품등록</a><br>
<a href="<%=request.getContextPath() %>/control?type=list">전체상품출력</a><br>
<a href="<%=request.getContextPath() %>/book/find.jsp">검색 및 수정 </a><br>
</body>
</html>