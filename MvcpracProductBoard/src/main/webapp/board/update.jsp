<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%@ page import="model.*" %>   

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% ProductVO m =(ProductVO)request.getAttribute("m");%>
	<form action="<%=request.getContextPath() %>control?pno=<%=m.getPno() %>" method="post">
		<input type="hidden" name="type"value="edit">
		
		��ǰ�̸� : <input type="text" name="pname" value=""<%=m.getPname() %>> <br/>
		��ǥ :  <input type="text" name="pname" value=""<%=m.getPmaker() %>> <br/>
		��ǰ���� : <input type="text" name="pname" value=""<%=m.getPprice() %>> <br/>
		������ : <input type="text" name="pname" value=""<%=m.getPdetail() %>> <br/>
		<input type="submit" value="����">
	</form>
</body>
</html>