<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="board.Article, java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>list</title>
<script type="text/javascript">
function a(num,pwd,type){
	n=parseInt(prompt("�� ��й�ȣ","0"));
	if(n!=pwd){
		alert("��й�ȣ ����ġ");
		return;
	}
	location.href="<%=request.getContextPath()%>/BoardController?num="+num+"&type="+type;
}
</script>
</head>
<body>
	<a href="<%=request.getContextPath()%>/board/form.jsp">�۾���</a>
	<a href="<%=request.getContextPath()%>/member/result.jsp">�޴�</a>
	
	<%
		ArrayList<Article> list=(ArrayList<Article>)request.getAttribute("list");
		
	%>
	<table>
		<tr>
			<th>�۹�ȣ</th>
			<th>�ۼ���</th>
			<th>�ۼ���</th>
			<th>�۳���</th>
			<th>����/����</th>
		</tr>
		<%	int i;
			for(i=0;i<list.size();i++){
				Article a = list.get(i);		
		%>
		<tr>
			<td><%=a.getNum()%></td>
			<td><%=a.getWriter() %></td>
			<td><%=a.getDate()%></td>
			<td><%=a.getContent() %></td>
			<td><%if(a.getWriter().equals((String)session.getAttribute("id"))){ %>
				<input type="button" value="edit" onClick="a(<%=a.getNum()%>,<%=a.getPwd()%>,'editForm')">
				<input type="button" value="delete" onClick="a(<%=a.getNum()%>,<%=a.getPwd()%>,'del')">							
			<%}%>
			</td>
		</tr>
		<%} %>
	</table>
</body>
</html>