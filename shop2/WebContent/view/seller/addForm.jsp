<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>addformJSP</title>
<script>
function numCheck(r){
	var pname = document.productForm.name;
	var pquantity = document.productForm.quantity;
	var pprice = document.productForm.price;
	var flag= isNaN(pquantity.value);
	var flag2= isNaN(pprice.value );
	if(flag){
		alert(" 숫자를 입력해주세요");
		return false;
	} 
	if(flag2){
		alert(" 숫자를 입력해주세요");
		return false;
	} 
	if(pname.value =="" ||pquantity.value =="" ||pprice.value ==""){
		alert(" 공백을 입력해주세요");
		return false;
	}
	r.submit();	
}
</script>
</head>
<body>
<h3>상품 등록</h3>
<form name="productForm" action="${pageContext.request.contextPath}/seller/Add" enctype="multipart/form-data" method="post">
<table>
	<tr><td><input type="text" name="name" placeholder="상품명" ></td></tr>
	<tr><td><input type="text" name="quantity" placeholder="수량"  ></td></tr>
	<tr><td><input type="text" name="price" placeholder="가격"  ></td></tr>
	<tr><td><input type="file" name="img" placeholder="상품이미지"></td></tr>
	<tr><td><input type="text" name="content" placeholder="상세설명"></td></tr>
</table>
	<input type="button" value="등록" onClick="numCheck(this.form)">
</form>
</body>
</html>