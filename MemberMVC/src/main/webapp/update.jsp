<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
 <%@page import="model.MemberVO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>update</title>
<script type="text/javascript">

</script>
</head>
<body>
<h3>회원정보 수정</h3>
<%MemberVO vo = (MemberVO)session.getAttribute("mvo");
  if(vo!=null){%>
  	<form action="<%=request.getContextPath()%>/UpdateServlet" method="post" name= "UpdateForm">
	id : <input type="text" name="userId" value="<%=vo.getId() %>" readonly>
	<label>pwd :<input type="password" name="pwd" value="<%=vo.getPwd() %>"></label><br>
	<label>name :<input type="text" name="name" value="<%=vo.getName()%>"></label><br>
	<label>address :<input type="text" name="address" value="<%=vo.getAddr()%>"></label><br>
	<input type="reset" value="취소">
	<input type="submit" value="수정">
</form>
  
<%} %>
</body>
</html>