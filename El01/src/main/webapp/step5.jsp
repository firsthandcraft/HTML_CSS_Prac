<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- ��� ���� or ��� �޼��� ���� �� ����Ѵ�.  -->
	<%!
		public ArrayList getList(){
		ArrayList list= new ArrayList();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		list.add("DDD");
		list.add("EEE");
		list.add("FFF");
		list.add("GGG");
		return list;
	}
	
	%>
	
	<table border="2">
		<%
			ArrayList list= getList();
			for(int i =0; i<list.size();i++){
		%>
		<tr>
			<td><%=i%></td>
			<td><%=list.get(i)%></td>
		</tr>		
		<%
			}
		%>
	
	
	</table>
</body>
</html>