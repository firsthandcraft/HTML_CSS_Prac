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
		//?�� get������� ���� 3�������� �ѱ�µ� 
		//sendRedirect�� ���� ���ε��� ���� ���
		
		//https://khs0806.tistory.com/10
		//inlcude �� �������������� ������ 
		///forward ��û�� ������ ���� �ؾ��� ��Ȳ 
		//�α��� �����ؾ��� ��Ȳ�� ��� 
		
		
		
		//sendRedirect�� Ŭ���̾�Ʈ�� ��û�� �ٸ��������� �ٽ� �����ϴ� ���
		//��û�� ��û��� ������ ������ 
		
		
	%>
</body>
</html>