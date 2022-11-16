<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="java.util.*" %>
<%--jstl 코어태그  --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>JSTL03</title>
</head>
<body>
<%
    List<String> list = new ArrayList<>();
    list.add("hello");
    list.add("world");
    list.add("!!!");
    request.setAttribute("list", list);
%>
<c:forEach items="${list}" var="item">
${item } <br>
</c:forEach>

</body>
</html>