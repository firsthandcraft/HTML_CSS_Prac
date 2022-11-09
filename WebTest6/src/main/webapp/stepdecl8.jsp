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
		context.setAttribute("m",m);//객체이름 ,객체
		// 스코프 객체의 하위 메서트 데이터 셋팅		
	}
	%>
	<h3>jspInit()메서드에서 생성한 객체</h3>
	<%--다운캐스팅  --%>
	<%Member m = (Member)application.getAttribute("m");
	out.print("id"+m.getId()+"<br>");
	out.print("pwd"+m.getPwd()+"<br>");
	out.print("name"+m.getName()+"<br>");
	out.print("email"+m.getEmail()+"<br>");
	%>
</body>
</html>