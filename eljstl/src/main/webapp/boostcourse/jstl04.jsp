<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="java.util.*" %>
<%--jstl 코어태그  --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>JSTL04</title>
</head>
<body>
<c:import url="http://localhost:8002/eljstl/boostcourse/jstl04_value.jsp" var="urlValue" scope="request"></c:import>
읽어들인 값 : ${urlValue}
</body>
</html>