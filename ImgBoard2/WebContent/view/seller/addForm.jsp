<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>addform</title>
</head>
<body>
<h3>상품 등록</h3>
<form action="${pageContext.request.contextPath }/seller/Add" method="post" 
enctype="multipart/form-data">
	<input type="text" name="name" placeholder="상품명"><br>
	<input type="text" name="quantity" placeholder="수량"><br>
	<input type="text" name="price" placeholder="가격"><br>
	<input type="file" name="file" placeholder="상품이미지등록"><br>
 	<textarea rows="10" cols="30" name="content" placeholder="상세설명"></textarea>
	<br>
<input type="submit" value="등록">
</form>
</body>
</html>