<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>find</title>
<script>
/*
function intCheck(r){
	var dd = document.r.num
	var flag2=isNaN(num2.value);
	if(dd.value==""){
		alert("���� �־��ּ���");
		return false;
	} 
	r.submit();
}*/
function intCheck(r){
	if(r.num.value==""){
		alert("���� �־��ּ���");
		return false;
	} 
	r.submit();
}

</script>
</head>
<body>
	<h3>�˻�</h3>
	<form action="<%=request.getContextPath()%>/control?type=update" method="post" >
		�˻� ��ȣ : <input type="text" name="num" >
		<input type="button"onClick="intCheck(this.form)" value="�˻�">
	</form>
		<form action="<%=request.getContextPath()%>/control?type=delete" method="post">
		���� ��ȣ : <input type="text" name="num" >
		<input type="button" onClick="intCheck(this.form)" value="�˻�">
	</form>
</body>
</html>