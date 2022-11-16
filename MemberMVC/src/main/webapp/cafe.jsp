<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.MemberVO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>cafe</title>
<script type="text/javascript">
	function ddddFF(){
		var user= confirm("로그아웃하시겠습니까?");
        if(user){
        	location.href="LogoutServlet"
        } 
	}
</script>
</head>
<body>

<c:choose>
	<c:when test="${sessionScope.mvo==null}">
	<script>
		alert("로그인하세요");
		location.href="login,jsp";
	</script>
	</c:when>
	<c:otherwise>
		${sessionScope.mvo.name}님<br><br>
		${sessionScope.mvo.addr}주소이다.<br><br>
		<button onclick="ddddFF()">로그아웃</button>
		<a href="LogoutServlet"></a>
	</c:otherwise>
</c:choose>

</body>
</html>









