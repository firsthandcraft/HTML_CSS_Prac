<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="model.Member"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body><%--선언하면 ctrl+shift+o 하지 않아도됨 내장 객체가 잇어서 --%>
	<%--scope 객체 --%>
	<%String id= request.getParameter("id");
	  String pwd = request.getParameter("pwd");
	  String name = request.getParameter("name");
	  String email = request.getParameter("email");
	  Member m =new Member(id,pwd,name,email);
	%>
	<h3>회원정보</h3>
	<table border='1'>
	<thead>
		<tr>
			<th>id</th>
			<th>pwd</th>
			<th>name</th>
			<th>email</th>		
		</tr>
	</thead>
	<tbody>
	<%--데이터를 받아올때 많이 사용--%>
		<tr>
			<td><%=m.getId()%></td>
			<td><%=m.getPwd()%></td>
			<td><%=m.getName()%></td>
			<td><%=m.getEmail()%></td>		
		</tr>
		
	<%--수정도 검색하고 출력해야하는데 수정이 안된다.방법이 있음-> stepxpr9.jsp--%>
		<tr>
			<td><%=id%></td>
			<td><%=pwd%></td>
			<td><%=name%></td>
			<td><%=email%></td>		
		</tr>
	</tbody>
	
	
	
	</table>
</body>
</html>