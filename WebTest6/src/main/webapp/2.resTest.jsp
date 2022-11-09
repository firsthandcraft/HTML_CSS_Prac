<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setAttribute("age",23);
		response.sendRedirect("3.resTest.jsp?name=hong");
		//?는 get방식으로 설정 3페이지로 넘기는데 
		//sendRedirect는 각자 따로따로 들어갈때 사용
		
		//https://khs0806.tistory.com/10
		//inlcude 는 같은페이지에서 보여줌 
		///forward 요청과 응답을 같이 해야할 상황 
		//로그인 유지해야할 상황에 사용 
		
		
		
		//sendRedirect는 클라이언트의 요청을 다른페이지로 다시 연결하는 기능
		//요청은 요청대로 응답은 응답대로 
		
		
	%>
</body>
</html>