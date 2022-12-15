<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>find</title>
</head>
<body>
<h3>회원검색</h3>
<form action="<%=request.getContextPath()%>/FindServlet" method="post" >
	id :<input type="text" name="userId"> 
	<input type="submit" value="검색"> 
</form>
</body>
</html>