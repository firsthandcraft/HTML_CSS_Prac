<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>상품검색</title>
</head>
<body>
	<h3>상품검색</h3>
	<form action="<%=request.getContextPath()%>/control?type=update" method="post">
		상품번호 : <input type="text" name="pno" >
		<input type="submit" value="검색">
	</form>
	<form action="<%=request.getContextPath()%>/control?type=delete" method="post">
		상품번호 : <input type="text" name="pno" >
		<input type="submit" value="삭제">
	</form>
</body>
</html>