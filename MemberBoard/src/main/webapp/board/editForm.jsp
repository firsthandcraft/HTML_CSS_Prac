<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="board.Article"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>editform</title>
</head>
<body>
<%
	Article a= (Article)request.getAttribute("a");
%>

	<form action="<%=request.getContextPath()%>/BoardController?type=edit&num=<%=a.getNum() %>"method="post">
		<table>
		<tr>
			<th>�۹�ȣ</th>
			<td><%=a.getNum() %></td>
		</tr>
		<tr>
			<th>�ۼ���</th>
			<td><%=a.getWriter() %></td>
		</tr>
		<tr>
			<th>�ۼ���</th>
			<td><%=a.getDate() %></td>
		</tr>
		<tr>
			<th>�� ��ȣ</th>
			<td><input type="text" name="pwd" value="<%=a.getPwd() %>"></td>
		</tr>
		<tr>
			<th>�۳���</th>
			<td><textarea cols="45" rows="15"name="content"><%=a.getContent()%></textarea></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="����"></td>
		</tr>
		</table>
	</form>
</body>
</html>