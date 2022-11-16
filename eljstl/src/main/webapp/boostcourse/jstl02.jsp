<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%--jstl 코어태그  --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>JSTL02</title>
</head>
<body>
<%--<%request.setAttribute("n", 10);%>--%>
<h3>c:if</h3>
<c:set var="n" scope="request" value="10"></c:set>
<c:if test="${n == 0}">
n은 과 0과 같습니다.
</c:if>

<c:if test="${n == 10}">
n은 과 10과 같습니다.
</c:if>
<hr>
<%--<%request.setAttribute("score", 83);%>--%>
<c:set var="score" scope="request" value="83"></c:set>
<h3>c:choose</h3>
<h4>c:when</h4>
<h4>c:otherwise</h4>
<c:choose>
    <c:when test="${score >=90 }">
    A학점입니다.
    </c:when>
    <c:when test="${score >=80 }">
    B학점입니다.
    </c:when>
    <c:when test="${score >=70 }">
    C학점입니다.
    </c:when>
    <c:when test="${score >=60 }">
    D학점입니다.
    </c:when>
    <c:otherwise>
    F학점입니다.
    </c:otherwise>            
</c:choose>
</body>
</html>