<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="model.Member"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%!
		public void jspInit(){
		Member m= new Member("id1","pwd2","name1","email1");
		ServletContext context = getServletContext();
		context.setAttribute("m",m);//��ü�̸� ,��ü
		// ������ ��ü�� ���� �޼�Ʈ ������ ����		
	}
	%>
	<h3>jspInit()�޼��忡�� ������ ��ü</h3>
	<%--�ٿ�ĳ����  --%>
	<%Member m = (Member)application.getAttribute("m");
	out.print("id"+m.getId()+"<br>");
	out.print("pwd"+m.getPwd()+"<br>");
	out.print("name"+m.getName()+"<br>");
	out.print("email"+m.getEmail()+"<br>");
	%>
</body>
</html>