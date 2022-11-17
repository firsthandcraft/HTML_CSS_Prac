<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>search.jsp</title>
</head>
<body>
<p>search.jsp</p>
<c:set var="str">
	<c:if test="${sessionScope.id!=b.writer}">
		readonly
	</c:if>
</c:set>
<th>작성자</th>
	<input type="text" value="${b.writer}" name="writer" ${str}>

<c:if test="${sessionScope.id==b.writer}">
	<input type="submit" value="수정">
	<input type="button" value="삭제" onClick="del(${b.num})">
</c:if>
	
</body>
</html>