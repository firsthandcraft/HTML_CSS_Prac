<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="model.Member"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body><%--�����ϸ� ctrl+shift+o ���� �ʾƵ��� ���� ��ü�� �վ --%>
	<%--scope ��ü --%>
	<%String id= request.getParameter("id");
	  String pwd = request.getParameter("pwd");
	  String name = request.getParameter("name");
	  String email = request.getParameter("email");
	  Member m =new Member(id,pwd,name,email);
	%>
	<h3>ȸ������</h3>
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
	<%--�����͸� �޾ƿö� ���� ���--%>
		<tr>
			<td><%=m.getId()%></td>
			<td><%=m.getPwd()%></td>
			<td><%=m.getName()%></td>
			<td><%=m.getEmail()%></td>		
		</tr>
		
	<%--������ �˻��ϰ� ����ؾ��ϴµ� ������ �ȵȴ�.����� ����-> stepxpr9.jsp--%>
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