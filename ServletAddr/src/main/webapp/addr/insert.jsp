<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert</title>
<script type="text/javascript">
function checkInsert(r){
	
	if(r.name.value=="" || r.tel.value=="" || r.addr.value==""||r.postal.value==""){
		alert("������ �Է��ϼ���.");
		//r.pname.focus();
		return
	}
	//��ȭ ��ȣ�� ���� 
	
	//�����ȣ 5-6�ڸ�
	var postN=document.addrForm.postal
	var flag= window.isNaN(postN.value)
	if(flag){
		alert("���� ��ȣ�� ���ڸ� �Է����ּ���");
		YearT.value="";
		YearT.focus();
		return false;
	} 
	r.submit();
}
</script>
</head>
<body>

	<form name="addrForm" action="<%=request.getContextPath()%>/control?type=insert" method="post">
		<table>
			<tr>
				<td>�̸� : <input type="text" name ="name"></td>
			</tr>
			<tr>
				<td>��ȭ��ȣ : <input type="tel" name ="tel"></td>
			</tr>
			<tr>
				<td>�ּ� : <input type="text" name ="addr"></td>
			</tr>
			<tr>
				<td>�����ȣ : <input type="text" name ="postal" placeholder="�����ȣ 6�ڸ�"></td>
			</tr>
		</table>
		<input type="button" onClick="checkInsert(this.form)" value="�ּ��Է�" >
	</form>
</body>
</html>