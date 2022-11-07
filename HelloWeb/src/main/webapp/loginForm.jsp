<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>login</h3>
	<form action="<%=request.getContextPath()%>>MyServlet8" method="post">
		id: <input type="text" name="id"><br/>
		pw: <input type="text" name="pwd"><br/>
		<input type="submit" value="loginbtn"> 
	
	</form>
</body>
</html>