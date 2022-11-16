<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%--jstl 코어태그  --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>el02</title>
</head>
<body>
<%
    request.setAttribute("k", 10);
    request.setAttribute("m", true);
%>    
k : ${k } <br> <!-- 10 -->
k + 5 : ${ k + 5 } <br><!-- 15 -->
k - 5 : ${ k - 5 } <br><!--5  -->
k * 5 : ${ k * 5 } <br><!--  50-->
k / 5 : ${ k div 5 } <br><!-- 2 -->
<!-- div는 예약어 /가 잘 인식이 안되어서 -->

k : ${k }<br>
m : ${m }<br>
k > 5 : ${ k > 5 } <br>
k < 5 : ${ k < 5 } <br>
k <= 10 : ${ k <= 10} <br>
k >= 10 : ${ k >= 10 } <br>
m : ${ m } <br>
!m : ${ !m } <br>


</body>
</html>