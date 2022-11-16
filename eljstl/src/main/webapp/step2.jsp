<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="model.MemberVO,java.util.HashMap"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>step2</title>
</head>
<body>
<h3>MemberVO</h3>
<h4>session으로 회원 정보 출력</h4>
<%MemberVO vo = (MemberVO)session.getAttribute("vosessionname"); %>
아이디 : <%=vo.getId()%> 
비번 : <%=vo.getPassword()%> 
주소: <%=vo.getAddress()%> 
<h4> el로 회원정보 출력</h4>
아이디 : ${sessionScope.vosessionname.id};
비번 : ${sessionScope.vosessionname.password}
주소 : ${sessionScope.vosessionname.address}
<br>
<h4>${MemberVOsessionName.id} 이렇게 작성해도 수행됨 왜? 각 세션을 검색하므로</h4>
아이디 : ${sessionName.id};
비번 : ${sessionName.password}
주소 : ${sessionName.address}
<br>
<hr>
<h3>String []</h3>
<h4>session으로 회원 정보 출력</h4>
<%String []names = (String[])session.getAttribute("stringnames");%>
<%=names[0] %>,<%=names[1] %>,<%=names[2] %>
<h4>el로 출력</h4>
${sessionScope.names[0]},${sessionScope.names[1]},${sessionScope.names[2]}
<hr>
<br>
<hr>
<h3>HashMap </h3>
<h4>session으로 회원 정보 출력</h4>
<%
	HashMap map =(HashMap)session.getAttribute("memMap");
	MemberVO vo1=(MemberVO)map.get("mem1");
	MemberVO vo2=(MemberVO)map.get("mem2");
%>
<%=vo1.getId() %><%=vo1.getAddress() %>
<%=vo2.getId() %><%=vo2.getAddress() %>
<h4>el로 출력</h4>
${sessionScope.memMap.mem1.id}
${sessionScope.memMap.mem1.address}
${sessionScope.memMap.mem2.id}
${sessionScope.memMap.mem2.address}











<hr>
</body>
</html>