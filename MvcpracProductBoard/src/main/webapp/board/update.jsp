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
		
		상품이름 : <input type="text" name="pname" value=""<%=m.getPname() %>> <br/>
		상표 :  <input type="text" name="pname" value=""<%=m.getPmaker() %>> <br/>
		상품가격 : <input type="text" name="pname" value=""<%=m.getPprice() %>> <br/>
		상세정보 : <input type="text" name="pname" value=""<%=m.getPdetail() %>> <br/>
		<input type="submit" value="수정">
	</form>
</body>
</html>