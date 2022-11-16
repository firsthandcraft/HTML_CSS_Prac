<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="model.MemberVO,java.util.ArrayList"%>
<%--jstl 코어태그  --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>step10</title>
</head>
<body>
<h3></h3>
<h4></h4>
<p></p>
<%String fa[] ={"강형욱","뽀삐","강산이","코카","콜라"};
  request.setAttribute("farray",fa);
%>
<%--기존 선언방식 --%>
<%String f[]= (String[])request.getAttribute("farray");
  for (int i= 0; i<fa.length;i++){%>
  <%=i %><%=fa[i] %>
  <%}%>
  
  <hr>
  2.jstl
  <%--<c:forEach> </c:forEach>
반복 처리에 사용되는 태그로 자바의 for문과 흡사하다.  --%>
<%--<속성>
items : 반복 처리할 대상이 배열이나 리스트일 때 대상 배열 또는 리스트 
var : items에서 꺼낸 객체 하나를 저장할 변수명 
varStatus : 반복의 상태를 저장할 변수명 
begin : 반복 횟수를 제어할 변수의 시작 값 
end : 반복 횟수를 제어할 변수의 증감 값 
step : 반복 횟수를 제어할 변수의 증감 값  --%>
  varStatus--> 현재 상태<br>
  <c:forEach items="${requestScope.farray}" var="far" varStatus="vs">
  	${vs.count}
  	${far}
  </c:forEach>
</body>
</html>