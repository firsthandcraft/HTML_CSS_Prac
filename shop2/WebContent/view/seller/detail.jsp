<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>sellerDETAIL</title>
<script>
function numCheck(r){
	var quantity= document.EditForm.quantity.value;
	var price= document.EditForm.price.value;
	if(quantity==""|| price==""){
		alert("���� �ȵ˴ϴ�.");
		return false;
	}
	r.submit();
}
function delForm(d){
	var flag= confirm("���� �����Ͻðڽ��ϱ�?");
		if(flag){
			document.EditForm.action="${pageContext.request.contextPath}/seller/Del?num=${p.num}";
			document.EditForm.submit(d);
		} else{
			alert("������ ��ҵǾ����ϴ�.");
		}
		
	}
</script>
</head>
<body>
<h4>sellerDetail</h4>
<form name="EditForm" action="${pageContext.request.contextPath}/seller/Edit" enctype="multipart/form-data" method="post">
<table border="1">
	<tr><td><label for="userName">��ǰ�� <input type="text" name="name" value="${p.name}" id="userName" readonly></label></td></tr>
	<tr><td><label for="userQuantity">���� <input type="text" name="quantity" value="${p.quantity}" id="userQuantity"></label></td></tr>
	<tr><td><label for="userPrice">���� <input type="text" name="price" value="${p.price}" id="userPrice"></label></td></tr>
	<tr><td><label for="userImg">�̹��� : ${p.img}<img src="${p.img}" width="300" height="300"/><input type="file" id="userImg" name="img"  value="${p.img}"></label></td></tr>
	<tr><td><label for="userContent">����<input type="text" name="content" id="userContent" value="${p.content}"></label></td></tr>
</table>
	<input type="reset" value="�ʱ�ȭ">
	<input type="button" value="����" onClick="numCheck(this.form)">
	<input type="button" value="����" onClick="delForm(this.form)">
	<input type="hidden" name="num" value="${p.num}">
	<input type="hidden" name="s_id" value="${p.s_id}">
</form>
</body>
</html>