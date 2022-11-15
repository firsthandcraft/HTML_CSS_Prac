<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="board.Article, java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>list</title>
<script type="text/javascript">
function a(num,pwd,type){
	n=parseInt(prompt("글 비밀번호","0"));
	if(n!=pwd){
		alert("비밀번호 불일치");
		return;
	}
	location.href="<%=request.getContextPath()%>/BoardController?num="+num+"&type="+type;
}
</script>
</head>
<body>
	<a href="<%=request.getContextPath()%>/board/form.jsp">글쓰기</a>
	<a href="<%=request.getContextPath()%>/member/result.jsp">메뉴</a>
	
	<%
		ArrayList<Article> list=(ArrayList<Article>)request.getAttribute("list");
		
	%>
	<table>
		<tr>
			<th>글번호</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>글내용</th>
			<th>수정/삭제</th>
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