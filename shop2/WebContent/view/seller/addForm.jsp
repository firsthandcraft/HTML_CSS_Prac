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
		alert(" ���ڸ� �Է����ּ���");
		return false;
	} 
	if(flag2){
		alert(" ���ڸ� �Է����ּ���");
		return false;
	} 
	if(pname.value =="" ||pquantity.value =="" ||pprice.value ==""){
		alert(" ������ �Է����ּ���");
		return false;
	}
	r.submit();	
}
</script>
</head>
<body>
<h3>��ǰ ���</h3>
<form name="productForm" action="${pageContext.request.contextPath}/seller/Add" enctype="multipart/form-data" method="post">
<table>
	<tr><td><input type="text" name="name" placeholder="��ǰ��" ></td></tr>
	<tr><td><input type="text" name="quantity" placeholder="����"  ></td></tr>
	<tr><td><input type="text" name="price" placeholder="����"  ></td></tr>
	<tr><td><input type="file" name="img" placeholder="��ǰ�̹���"></td></tr>
	<tr><td><input type="text" name="content" placeholder="�󼼼���"></td></tr>
</table>
	<input type="button" value="���" onClick="numCheck(this.form)">
</form>
</body>
</html>