<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>�޴�</h3>
	<%boolean flag= false; 
	  if(!session.isNew()){//session�� �������� �ʾ����� 
		  flag=(boolean)session.getAttribute("flag");
	  }
	  if(flag){
		String id = (String)session.getAttribute("id");
	  %>
	  	<%=id %>�� �α���<br>
	  	<a href="<%=request.getContextPath() %>/LogoutController">�α׾ƿ�</a>
	  	<br>
	  	<a href="<%=request.getContextPath() %>/SearchController">����������</a>
	  	<br>
	  	<a href="<%=request.getContextPath() %>/DelController">Ż��</a>
	  	<%
	  		}else{
	  	%>
	  		<h3>�α��� ����</h3>
	  		<a href="<%=request.getContextPath() %>/member/loginForm.jsp">�α���</a>
	  <%} %>
	  
</body>
</html>