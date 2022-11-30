<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>delete</title>
<script>
function intCheck(){
	var num = document.updateForm.pno;
	var flag==isNaN(num.value);
	if(num.value==""){
		alert("값을 넣어주세요");
	} else if(flag){
		alert("숫자입력");
		num.value="";
		num.focus();
		return false;
	} else{ alert(num.value+"입력완료");}
}
</script>
</head>
<body>
	<h3>검색</h3>
	<form action="<%=request.getContextPath()%>/control?type=update" method="post" name="updateForm" onsubmit=" return intCheck()">
		상품번호 : <input type="text" name="pno" >
		<input type="submit" value="삭제">
	</form>

</body>
</html>