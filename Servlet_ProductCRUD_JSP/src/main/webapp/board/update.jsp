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
	<form action="<%=request.getContextPath() %>control?num=<%=m.getPno() %>" method="post">
		<input type="hidden" name="type"value="edit">
		
		상품이름 : <input type="text" name="pname" value="<%=m.getPname() %>"> <br/>
		상표 :  <input type="text" name="pmaker" value="<%=m.getPmaker() %>"> <br/>
		상품가격 : <input type="text" name="pprice" value="<%=m.getPprice() %>"> <br/>
		상세정보 : <input type="text" name="pdetail" value="<%=m.getPdetail() %>"> <br/>
		<input type="submit" value="수정">
	</form>
</body>
</html>