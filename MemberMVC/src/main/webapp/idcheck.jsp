<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script>
function winClose(b){
	var rf = opener.document.registerForm;
	if(b){
		rf.id.value="";
		rf.id.focus();
	} else{
		rf.pwd.focus();
	}
	self.close();
}
</script>
</head>
<body bgcolor="yellow">
	<%String id = request.getParameter("id");
		boolean flag=(Boolean)request.getAttribute("flag");
		if(flag){
	%>
	<%=id  %>�� �ߺ��˴ϴ�.<br>
	�ٸ����̵� �Է��ϼ���.
	<%} else { %>
		<%=id%>�� ��밡���մϴ�.
	<%}%>
	
	<input type="button" value="Ȯ��" onClick="winClose(<%=flag%>)">
</body>
</html>