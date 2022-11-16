<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>updateresult</title>
</head>
<body>
아이디 : ${sessionScope.mvo.id}, 
비번 : ${sessionScope.mvo.pwd}, 
이름:${sessionScope.mvo.name}
주소 : ${sessionScope.mvo.addr}
 <a href="index.jsp">처음으로</a>
</body>
</html>