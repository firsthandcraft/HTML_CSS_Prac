<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>addform</title>
</head>
<body>
<h3>��ǰ ���</h3>
<form action="${pageContext.request.contextPath }/seller/Add" method="post" 
enctype="multipart/form-data">
	<input type="text" name="name" placeholder="��ǰ��"><br>
	<input type="text" name="quantity" placeholder="����"><br>
	<input type="text" name="price" placeholder="����"><br>
	<input type="file" name="file" placeholder="��ǰ�̹������"><br>
 	<textarea rows="10" cols="30" name="content" placeholder="�󼼼���"></textarea>
	<br>
<input type="submit" value="���">
</form>
</body>
</html>