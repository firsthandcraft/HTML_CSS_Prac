<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>find ok</title>
</head>
<body>
 �˻���� ���̵� : ${requestScope.mvo.id}, �̸�:${requestScope.mvo.name}
  		�ּ� : ${requestScope.mvo.addr}
 <a href="index.jsp">ó������</a>
</body>
</html>