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
	pageContext.setAttribute("pageScope","page date");//���尴ü �ٷμ��𰡴�
	request.setAttribute("requestScope","request data");
	session.setAttribute("sessionScope","session data");
	application.setAttribute("applicationScope","application data");

	//���� ����ϰ����ϴ� Ÿ������ �ٿ� ĳ����
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