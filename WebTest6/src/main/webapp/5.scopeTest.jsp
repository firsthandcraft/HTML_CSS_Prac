<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	pageContext.setAttribute("pageScope","page date");//내장객체 바로선언가능
	request.setAttribute("requestScope","request data");
	session.setAttribute("sessionScope","session data");
	application.setAttribute("applicationScope","application data");

	//내가 출력하고자하는 타입으로 다운 캐스팅
	String myPage=(String)pageContext.getAttribute("pageScope");
	String myRequest=(String)request.getAttribute("requestScope");
	String mySession=(String)session.getAttribute("sessionScope");
	String myApplication=(String)application.getAttribute("applicationScope");
	
	pageContext.forward("6.scopeTest.jsp");
	
%>
<%--pageScope null
requestScope request data
sessionScopesession data
applicationScopeapplication data --%>
</body>
</html>