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
	alert("${param.userId}�� �ش��ϴ� ȸ�� ����!");
	location.href="index.jsp";
</script>
</body>
</html>