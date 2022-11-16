<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%--jstl 코어태그  --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>step6</title>
</head>
<body>
<h3>코어태그</h3>
<h5>c:if</h5>
<%-- <c:if>태그는 조건을 만족하는 것만 제어할 수 있고 조건을 만족하지 않는 것은 제어할 수 없다. 
자바 if문에서 else가 없는 것과 같다. <c:choose>태그는 만족할 때와 그렇지 않을 때를 구현할 
수 있다. 이 태그는 속성 없이 내부에 조건을 체크할 <c:when> </c:otherwise>태그를 포함한다.
사용 예)
<c:if test="${x==10} >
    실행문 
</c:if>
->x가 10이면 if태크 사이의 실행문을 실행하고, x가 10이 아니면 실행되지 않는다. 

--%>
<%request.setAttribute("name","aaa"); %>
<c:if test="${name=='aaa'}">
aaa님이 맞습니다.
</c:if>
<br>
</body>
</html>