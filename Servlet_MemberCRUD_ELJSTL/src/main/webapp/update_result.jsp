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
���̵� : ${sessionScope.mvo.id}, 
��� : ${sessionScope.mvo.pwd}, 
�̸�:${sessionScope.mvo.name}
�ּ� : ${sessionScope.mvo.addr}
 <a href="index.jsp">ó������</a>
</body>
</html>