<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="model.MemberVO"%>
<%--jstl 코어태그  --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>step8</title>
</head>
<body>
<h3>코어태그</h3>

<%MemberVO vo= new MemberVO("idid","paspwd","선릉");
request.setAttribute("mvo",vo);
%>
<h5>el연습</h5>
<h6>cchoose</h6>
<%--
<c:choose> </c:choose>
<c:if>태그는 조건을 만족하는 것만 제어할 수 있고 조건을 만족하지 않는 것은 제어할 수 없다. 
자바 if문에서 else가 없는 것과 같다. <c:choose>태그는 만족할 때와 그렇지 않을 때를 구현할 
수 있다. 이 태그는 속성 없이 내부에 조건을 체크할 <c:when> </c:otherwise>태그를 포함한다.
사용 예) 
<c:choose> 
<c:when test="조건">
조건 만족시 실행할 문장 
</c:when>
<c:otherwise>
조건 불만족 시 실행할 문장 
</c:otherwise>
</c:choose>--%>
el -> id : ${request.mvo.id}
      password : ${request.mvo.password}
      address : ${request.mvo.address} 

<c:choose>
	<c:when test="${request.mvo.address=='판교'}">성남</c:when>
	<c:when test="${request.mvo.address=='강남'}">천호</c:when>
	<c:otherwise><b>잠실 </b><small>(c:otherwise는 else의 의미이다.)</small> </c:otherwise>
</c:choose>
 
 
 
 
 
 
 
 
 
 
 




</body>
</html>