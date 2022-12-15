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
		alert("공란을 입력하세요.");
		//r.pname.focus();
		return
	}
	//전화 번호도 쓰기 
	
	//우편번호 5-6자리
	var postN=document.addrForm.postal
	var flag= window.isNaN(postN.value)
	if(flag){
		alert("우편 번호에 숫자를 입력해주세요");
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
				<td>이름 : <input type="text" name ="name"></td>
			</tr>
			<tr>
				<td>전화번호 : <input type="tel" name ="tel"></td>
			</tr>
			<tr>
				<td>주소 : <input type="text" name ="addr"></td>
			</tr>
			<tr>
				<td>우편번호 : <input type="text" name ="postal" placeholder="우편번호 6자리"></td>
			</tr>
		</table>
		<input type="button" onClick="checkInsert(this.form)" value="주소입력" >
	</form>
</body>
</html>