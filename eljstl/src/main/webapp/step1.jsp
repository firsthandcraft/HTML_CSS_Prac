<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="model.MemberVO,java.util.HashMap"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>step1</title>
</head>
<body>
<%-- scope객체
page " java.servlet.jsp.JspContent 햔제 페이지 내에서만 공유
request
session
application
--%>
<%
MemberVO vo = new MemberVO("아이디","비번","주소");
session.setAttribute("vosessionname",vo);

String names[]={"ddd","bbb","ccc"};
session.setAttribute("stringnames",names);

HashMap map= new HashMap();
map.put("mem1",vo);

MemberVO vo1= new MemberVO("jsp","1234","이진우");
map.put("mem2",vo1);

session.setAttribute("memMap",map);


%>
<%-- EL 첫번째 예제--%>
<a href="step2.jsp">step2에서 el 처리확인</a>

</body>
</html>