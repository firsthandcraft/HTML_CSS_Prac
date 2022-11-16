<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%--jstl 코어태그  --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>JSTL01</title>
</head>
<body>
<c:set var="value1" scope="request" value="kang"/>
성 : ${value1} <br>
<c:remove var="value1" scope="request"/>
성 : ${value1 }

</body>
</html>