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
 검색결과 아이디 : ${requestScope.mvo.id}, 이름:${requestScope.mvo.name}
  		주소 : ${requestScope.mvo.addr}
 <a href="index.jsp">처음으로</a>
</body>
</html>