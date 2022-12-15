<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="model.*"%>  
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>list</title>
</head>
<body>
	<% ArrayList<BookVo>list= (ArrayList<BookVo>)request.getAttribute("data"); %>
	<form name="x" action="<%=request.getContextPath()%>/control? type=insert" method="post" >
	<!--1. getAttribute-->
		<table border='1'>
			<tr>
				<th>num</th>
				<th>author</th>
				<th>title</th>
				<th>publisher</th>
				<th>content</th>
			</tr>
			
			<%for(int i=0; i<list.size(); i++){
				BookVo x= list.get(i);%>		
			<tr>
				<td><%=x.getNum() %></td>
				<td><%=x.getAuthor() %></td>
				<td><%=x.getTitle() %></td>
				<td><%=x.getPublisher() %></td>
				<td><%=x.getContent() %></td>
			</tr>
			<%} %>
		</table>
	</form>
</body>
</html>




