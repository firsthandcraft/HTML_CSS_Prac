<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>��ǰ�˻�</title>
</head>
<body>
	<h3>��ǰ�˻�</h3>
	<form action="<%=request.getContextPath()%>/control?type=update" method="post">
		��ǰ��ȣ : <input type="text" name="pno" >
		<input type="submit" value="�˻�">
	</form>
	<form action="<%=request.getContextPath()%>/control?type=delete" method="post">
		��ǰ��ȣ : <input type="text" name="pno" >
		<input type="submit" value="����">
	</form>
</body>
</html>