<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>��ǰ�˻�</title>
<script>
function intCheck(){
	var num = document.updateForm.pno;
	var flag=isNaN(num.value);
	if(num.value==""){
		alert("���� �־��ּ���");
		return false;
	} else if(flag){
		alert("�����Է�");
		num.value="";
		num.focus();
		return false;
	}
	
}
</script>
</head>
<body>
	<h3>��ǰ�˻�</h3>
	<form action="<%=request.getContextPath()%>/control?type=update" method="post" name="updateForm" onsubmit=" return intCheck()">
		��ǰ��ȣ : <input type="text" name="pno" >
		<input type="submit" value="�˻�">
	</form>
	<form action="<%=request.getContextPath()%>/control?type=delete" method="post">
		��ǰ��ȣ : <input type="text" name="pno" >
		<input type="submit" value="����">
	</form>
</body>
</html>