<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>result</title>
</head>
<body>
<h5>result</h5>
<%--boolean flag= false;
	if(!session.isNew()){
		flag=(boolean)session.getAttribute("flag");
	}
	if(flag){
		String id= (String)session.getAttribute("id");
	--%>
<h3>${sessionScope.id}�� �������</h3>
<a href="${pageContext.request.contextPath}/SearchController">ȸ�� ���� ����</a>
<a href="${pageContext.request.contextPath}/LogoutController">�α׾ƿ�</a>
<a href="${pageContext.request.contextPath}/DelController">Ż���ϱ�</a>
<a href="${pageContext.request.contextPath}/seller/List">���θ�</a>
	
</body>
</html>