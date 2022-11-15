<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"  import="member.Member"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>result</title>
</head>
<body>

<% String vo = (String)session.getAttribute("id");
	if(vo!=null && !vo.equals("")){%>
<%=vo%>님 로그인 ok<br>
<a href="<%=request.getContextPath()%>/Controller?type=logout">로그아웃</a>
<a href="<%=request.getContextPath()%>/Controller?type=out">탈퇴</a>
<a href="<%=request.getContextPath()%>/Controller?type=search">내정보수정</a>
<a href="<%=request.getContextPath()%>/BoardController?type=boardlist">리스트</a>


<%}%>
</body>
</html>