<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="model.Member"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>editForm</title>
</head>
<body>
	
<c:if test="${not empty m}">
	<form name="f" action="${pageContext.request.contextPath}/EditController" method="post">
		<table>
				<tr>
					<td><input type="text" name="id" value="${m.id}" readonly></td>
					<td><input type="hidden" name="type" value="${m.type}" readonly>
					<c:if test="${m.type==1}">
						판매자
					</c:if>
					<c:if test="${m.type==2}">
						구매자
					</c:if></td>
				</tr>
				<tr>
					<td><input type="password" name="pwd" value="${m.pwd}"></td>
				</tr>
				<tr>
					<td><input type="text" name="name" value="${m.name}"></td>
				</tr>
				<tr>
					<td><input type="email" name="email" value="${m.email}"></td>
				</tr>
				<tr>
					<td><input type="text" name="addr" value="${m.addr}"></td>
				</tr>
				<tr colspan="2">
					<td><input type="reset" value="초기화"></td>
					<td><input type="submit" value="수정"></td>
				</tr>
		</table>
	</form>
</c:if>
		

</body>
</html>