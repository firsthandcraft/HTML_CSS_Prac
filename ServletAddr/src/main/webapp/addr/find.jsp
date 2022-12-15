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
		alert("값을 넣어주세요");
		return false;
	} 
	r.submit();
}*/
function intCheck(r){
	if(r.num.value==""){
		alert("값을 넣어주세요");
		return false;
	} 
	r.submit();
}

</script>
</head>
<body>
	<h3>검색</h3>
	<form action="<%=request.getContextPath()%>/control?type=update" method="post" >
		검색 번호 : <input type="text" name="num" >
		<input type="button"onClick="intCheck(this.form)" value="검색">
	</form>
		<form action="<%=request.getContextPath()%>/control?type=delete" method="post">
		삭제 번호 : <input type="text" name="num" >
		<input type="button" onClick="intCheck(this.form)" value="검색">
	</form>
</body>
</html>