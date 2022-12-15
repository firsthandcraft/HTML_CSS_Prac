<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>find</title>
<script>
function intCheck(){
	var num = document.updateForm.pno;
	var flag=isNaN(num.value);
	if(num.value==""){
		alert("값을 넣어주세요");
		return false;
	} else if(flag){
		
		
		alert("숫자입력");
		num.value="";
		num.focus();
		return false;
	} 
}
</script>
</head>
<body>
	<h3>검색</h3>
	<%-- //action="<%=request.getContextPath()%>/control?type=update"  --%>
	<form method="post" name="updateForm">
		상품번호 : <input type="text" name="pno" >
		<input type="button" value="검색" onClick="intCheck(this.form)">
		<input type="button" value="삭제" onClick="intCheck(this.form)">
	</form>

</body>
</html>