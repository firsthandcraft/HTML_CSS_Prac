<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>board form</title>
</head>
<body>
<h3>게시판</h3>
	<form action="${pageContext.request.contextPath}/WriteController" method="post">
		<table border="1">
			<tr>
				<th>글번호</th>
				<td><input type="text" value="" name="num" size="45" readonly></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input type="text" value="" name="writer" size="45" readonly></td>
			</tr>
			<tr>
				<th>작성날짜</th>
				<td><input type="text" value="" name="date" size="45" readonly></td>
			</tr>
			<tr>
				<th>글제목</th>
				<td><input type="text" name="title" size="45"></td>
			</tr>		
			<tr>
				<th>글내용</th>
				<td><textarea cols="45" rows="15" name="content"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align:center"><input type="reset" value="취소">
					<input type="submit" value="작성"></td>
			</tr>
		</table>
	</form>
</body>
</html>