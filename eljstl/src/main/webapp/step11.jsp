<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%--jstl 코어태그  --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>step11</title>
</head>
<body>
<%--
<c:url> </c:url>
URL을 생성하는 태그이다. 

<속성>
var : URL을 저장할 변수 이름 
value :  저장할 URL 값 
scope : 변수를 저장할 스코프 객체 


<사용 예>
<c:url var="url" value="/member/login.jsp"/>
->변수 url에 "/member/login.jsp"저장 


<c:import> </c:import>
다른 웹 페이지를 url 속성에 지정한 파일 내용을 해당 태그 위치에 출력하거나 변수에 저장한다. 

<속성>
URL : import 할 페이지 URL 
value :  import페이지의 내용을 저장할 변수 이름  
scope : 저장할  스코프 객체 

<사용 예>
<c:import url="/importPage.jsp"></c:import>
-현재 위치에 "/importPage.jsp"페이지를 출력 
 --%>
<h3 style="text-align:center;">import page</h3>
<h4>c:import // c:url</h4>
<p style="text-align:center;">
	눈이부시게<br>
	푸르른 날엔<br>
	그리운 사람을 <br>
	그리워 하자 <br>
</p>
<%%>

</body>
</html>