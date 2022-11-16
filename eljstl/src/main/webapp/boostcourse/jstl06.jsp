<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="java.util.*" %>
<%--jstl 코어태그  --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>JSTL06</title>
</head>
<body>
<h3>자바스크립트로 나옴</h3>
<c:set var="t" value="<script type='text/javascript'>alert(1);</script>" />
${t}

<h5>escapeXml쓰면 문자 자체로 인식되어 자바스크립트로 실행이 안되고 화면에 자바코드가 문자로 나온다. </h5>
<c:out value="${t}" escapeXml="true" />
<c:out value="${t}" escapeXml="false" />
</body>
</html>