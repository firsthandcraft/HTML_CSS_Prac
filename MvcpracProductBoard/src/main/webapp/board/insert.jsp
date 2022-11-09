<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
function checkInsert(r){
	if(r.pname.value=="" || r.pmaker.value=="" || r.pprice.value==""||r.pdetail.value==""){
		alert("공란을 입력하세요.");
		//r.pname.focus();
		return
	}
	r.submit();
	
}

</script>

</head>
<body>
	<form name="x" action="<%=request.getContextPath()%>/control?type=insert" method=post >
	<!-- getContextPath ->  / ? ->get방식으로 -->
		<table>
			<tr>
				<td>상품명 : <input type="text" name ="pname"></td>
			</tr>
			<tr>
				<td>제조사 : <input type="text" name ="pmaker"></td>
			</tr>
			<tr>
				<td>가격 : <input type="text" name ="pprice"></td>
			</tr>
			<tr>
				<td>상세정보 : <textarea row="5" name="pdetail" cols="40"></textarea></td>
			</tr>
			
		</table>
		<input type="button" onClick="checkInsert(this.form)" value="상품입력">	
	</form>
</body>
</html>