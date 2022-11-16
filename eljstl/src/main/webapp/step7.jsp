<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%--jstl 코어태그  --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>step7</title>
</head>
<body>
<h3>코어태그</h3>
<h5>jstl if연습</h5>
<c:if test="true">
true이므로 수행
<script>수행</script>
</c:if>
<br>
<c:if test="false">
false이므로 미수행
<script>미수행</script>
</c:if>
<br>

<h5>command</h5>
<a href="step7.jsp?command=java">현재페이지 호출 --> java가 나온다.</a>
${param.command}
<br>

<h5>c:if 의 참값 --> 수행</h5>
<c:if test="${param.command=='java'}">
${param.command}이므로 if 수행</c:if><br>

<a href="step7.jsp?id=jstl&age=20">현재페이지 호출id와 age전달</a>
<c:if test="${param.id=='jstl'&& param.age==20}">
id : ${param.id}
age: ${param.age}
</c:if><br>


</body>
</html>