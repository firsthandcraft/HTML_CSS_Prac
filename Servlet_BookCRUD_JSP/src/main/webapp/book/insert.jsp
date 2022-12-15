<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>insert</title>
</head>
<script>
	function checkInsert(r){
		if(r.author.value=="" || r.title.value=="" || r.publisher.value==""||r.content.value==""){
			alert("공란을 입력하세요.");
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
				<td>저자 : <input type="text" name ="author"></td>
			</tr>
			<tr>
				<td>책제목 : <input type="text" name ="title"></td>
			</tr>
			<tr>
				<td>출판사 : <input type="text" name="publisher"></td>
			</tr>
			<tr>
				<td>상세정보 : <textarea row="5" name="content" cols="40"></textarea></td>
			</tr>
			
		</table>
		<input type="button" onClick="checkInsert(this.form)" value="상품입력">	
	</form>
</body>
</html>