<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>find fail</title>
</head>
<body>
<script>
	alert("${param.userId}에 해당하는 회원 없음!");
	location.href="index.jsp";
</script>
</body>
</html>