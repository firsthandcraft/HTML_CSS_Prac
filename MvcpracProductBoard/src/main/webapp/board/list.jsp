<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" %>
    
<%@page import ="model.*" %>
<%-- --%>
<%@page import ="java.util.ArrayList" %>
<%--util안에 ArrayList를 가져온다.  --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
</script>

</head>
<body>
<% ArrayList<ProductVO>list= (ArrayList<ProductVO>)request.getAttribute("data"); %>

	<form name="x" action="<%=request.getContextPath()%>/control? type=insert" method="post" >
	<!--1. getAttribute-->
		<table border='1'>
			<tr>
				<th>pno</th>
				<th>pname</th>
				<th>pmaker</th>
				<th>pprice</th>
				<th>pdetail</th>
			</tr>
			
			<%for(int i=0; i<list.size(); i++){
				ProductVO x= list.get(i);%>		
			<tr>
				<td><%=x.getPno() %></td>
				<td><%=x.getPname() %></td>
				<td><%=x.getPmaker() %></td>
				<td><%=x.getPprice() %></td>
				<td><%=x.getPdetail() %></td>
			</tr>
			<%} %>
		</table>
	</form>
</body>
</html>