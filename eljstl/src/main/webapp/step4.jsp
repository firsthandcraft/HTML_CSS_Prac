<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="model.Member"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>step4</title>
</head>
<body>
<%ArrayList<Member> list = new ArrayList<Member>();
list.add(new Member("a1","a2","a3","a4"));
list.add(new Member("b1","b2","b3","b4"));
list.add(new Member("c1","c2","c3","c4"));
pageContext.setAttribute("list",list);
%>
<h3>ArrayList 에서 el로 가져오기</h3>
list[0] : ${list[0].id},${list[0].pwd}
			,${list[0].name},${list[0].email}<br>
list[1] : ${list[1].id},${list[1].pwd}
			,${list[1].name},${list[1].email}<br>
list[2] : ${list[2].id},${list[2].pwd}
			,${list[2].name},${list[2].email}<br>			

<hr>
</body>
</html>