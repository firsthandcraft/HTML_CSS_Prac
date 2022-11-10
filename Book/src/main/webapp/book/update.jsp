<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>update</title>
</head>
<body>
<% BookVo m =(BookVo)request.getAttribute("m");%>
	<form action="<%=request.getContextPath() %>/control?pno=<%=m.getNum() %>" method="post">
		<input type="hidden" name="type"value="edit">
		
		저자 : <input type="text" name="author" value="<%=m.getAuthor() %>"> <br/>
		책제목 :  <input type="text" name="title" value="<%=m.getTitle() %>"> <br/>
		출판사 : <input type="text" name="publisher" value="<%=m.getPublisher() %>"> <br/>
		상세정보 : <input type="text" name="content" value="<%=m.getContent() %>"> <br/>
		<input type="submit" value="수정">
		
	</form>
	
</body>
</html>

