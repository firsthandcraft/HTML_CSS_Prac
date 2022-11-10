<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import="AddrDao.*" %>
    <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>list</title>
</head>
<body>
<%ArrayList<Member> list= (ArrayList<Member>)request.getAttribute("data"); %>
<form name="x" action="<%=request.getContextPath()%>/control? type=list" method="post" >
	<!--1. getAttribute-->
		<table border='1'>
			<tr>
				<th>num</th>
				<th>name</th>
				<th>tel</th>
				<th>address</th>
				<th>postal</th>
			</tr>
			
			<%for(int i=0; i<list.size(); i++){
				Member x= list.get(i);%>		
			<tr>
				<td><%=x.getNum() %></td>
				<td><%=x.getName() %></td>
				<td><%=x.getTel() %></td>
				<td><%=x.getAddress() %></td>
				<td><%=x.getPostal() %></td>
			</tr>
			<%} %>
		</table>
	</form>
</body>
</html>