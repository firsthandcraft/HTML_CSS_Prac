<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>register</title>
<script type="text/javascript">
function registerCheck(){ 
	var f = document.registerForm;
	if(f.id.value=""){
		alert("���̵� �Է��ϼ���!");
		return false;
	} else if(f.pass.value=""){
		alert("��й�ȣ�� �Է��ϼ���!");
		return false;
	} else if(f.name.value=""){
		alert("�̸��� �Է��ϼ���!");
		return false;
	}else if(f.address.value=""){
		alert("�ּҸ� �Է��ϼ���!");
		return false;
	}
	f.submit();
}
function checkId(){
	var rId=document.registerForm.userId.value;
	window.open("IdCheckServlet?id="+rId,"popup","resizable=no,toolbar=no, width=200, height=300");
}
</script>
</head>
<body>
<h3>ȸ������</h3>
	<form action="<%=request.getContextPath()%>/RegisterServlet" method="post" name= "registerForm" onsubmit="return registerCheck()">
	id : <input type="text" name="userId"><input type="button" value="�ߺ�Ȯ��" onClick="checkId()"><br>
	<label>pwd :<input type="password" name="pwd"></label><br>
	<label>name :<input type="text" name="name"></label><br>
	<label>address :<input type="text" name="address"></label><br>
	<input type="reset" value="���">
	<input type="submit" value="����">
</form>
</body>
</html>