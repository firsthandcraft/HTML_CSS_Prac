<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="model.Member"%>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%--jstl 코어태그 
코어 
변수 제어와 프로그램의 흐름을 제어하는 태그, URL, 제어 , 출력 태그들로 구성된다. 코어 태그들이
정의된 URL은 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>으로 접두사는 
c를 사용한다. 접두사는 태그의 종류를 나타내는 것으로 코어는 C, XML은 x등으로 미리 정의되어
있다. JSTL의 태그를 사용하려면 먼저 taglic디렉티브 태그 라이브러리를 설정해야 하느데 이때 
URL과 접두사가 필요하다.  taglib 디렉티브를 다음과 같이 작성해야 한다.  --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>step5</title>
</head>
<body>
<h3>코어태그</h3>
 <%int x=10;
 	Map<String, String>map= new HashMap<String, String>();
 	map.put("a1","a2");
 	map.put("b1","b2");
 	map.put("c1","c2");
 	
 	Member m =new Member("aaa","bbb","ccc","d@dd.ddd");
 	//원래는 이거는 서블릿에서 제작하는거
 %>
 <%--<% %>에 선언한 변수의 값 10을 set 태그로 선언한 변수 x에 할당한다.--%>
 <%--set태그로 선언한 변수에 scope를 지정하지 않으면 pagecontext에 저장된다.--%>
  <%--
코어의 태그들 
<c:set> </c:set>
변수 선언 및 값을 할당할 수 있다. 이 태그로 변수를 선언하면 스코프객체 
pageContext,  request, session, application 중 하나에 저장된다.
 저장될 스코프 객체를 지정하는 속성은 scope로 지정하지 않으면 pageContext로 저장된다. 
 --%>
 <br>
 <h5>x를 pageContext에 x이름으로 저장 후 출력</h5>
 <%-- <속성>
var : 변수 이름 
value :  변수에 저장할 값 
scope : 저장될 스코프 객체 
target : 멤버 변수를 변경할 맵이나 객체명 
property : 변경할 멤버 변수명 --%>
<h6>코어 태그 출력할것</h6>
	<c:set var ="x" value="<%=x %>"></c:set>
	<%--또는 단일 태그로도 가능 <c:set var ="x" value="<%=x %>"/>ㄴ --%>
	x:${x}
<hr>

<h5>map 객체를 pageContext에 map1이름으로 저장 후 출력 var,value</h5>
<%--var : 변수 이름 
value :  변수에 저장할 값  --%>
<c:set var ="map1" value="<%=map %>"/>
map1 => a1 : ${map1.a1},
		b1:${map1.b1}
<br>
<h5>map에 b1 키의 값을 222로 변경 뒤 출력 target,property,value</h5>
<%--property : 변경할 멤버 변수명 --%>
<c:set target="${map1}" property="b1" value="222"/>
map1 => a1 : ${map1.a1},
		b1:${map1.b1}
<br>
<h5>map을 pageContext에 map2이름으로 저장후 출력</h5>
<%--var : 변수 이름 
value :  변수에 저장할 값  --%>
<c:set var="map2" value="<%=map %>"/>
map2 => a1 : ${map2.a1},
		b1:${map2.b1},
		c1:${map2.c1}
<br>
<h5>객체 m의 a1을 ccc, b2를 장동건으로 수정 뒤 출력</h5>
<%--var : 변수 이름 
value :  변수에 저장할 값  
 	Member m =new Member("aaa","bbb","ccc","d@dd.ddd");--%>
<c:set target="<%=m%>" property="id" value="a1a1a1"/>
<c:set target="<%=m%>" property="name" value="장동건"/>
<c:set var="m1" value="<%=m%>"/>
Member m 출력=> <br>
			  id	aaa : ${m1.id},<br>
			  pwd	bbb: ${m1.pwd},<br>
			  name	ccc: ${m1.name},<br>	
			  email	dEmail : ${m1.email}<br>
  
<br>
<h5>scope 출력하기</h5>
<%--scope : 저장될 스코프 객체 
사용 예 )
<c:set var ="x" value="<%=x%>" scope="request"/>
<% %>안에서 선언한 x의 값을 request에 x1에 이름으로 저장--%>
<c:set var="y" scope="page"/>page<br>
<c:set var="y" scope="request"/>request<br>
<c:set var="y" scope="session"/>session<br>
<c:set var="y" scope="application"/>application<br>

${pageScope.y}<br>
${requestScope.y}<br>
${sessionScope.y}<br>
${applicationScope.y}<br>

<br>
<h5>스코프 삭제 (c:remove)</h5>
<%--<c:remove/>
변수를 스코프 객체에서 제거한다. 
<속성 >
var : 삭제할 변수명 
scope :  삭제할 대상이 저장된 스코프 
사용예) 
<c:remove var ="x1" scope="request"/>
request에서 변수 x1을 삭제  --%>
<c:remove var ="y" scope="request"/>
${pageScope.y}<br>
${requestScope.y}<br>
${sessionScope.y}<br>
${applicationScope.y}<br>
</body>
</html>