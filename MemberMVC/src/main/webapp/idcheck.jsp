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
	<%=id  %>는 중복됩니다.<br>
	다른아이디를 입력하세요.
	<%} else { %>
		<%=id%>는 사용가능합니다.
	<%}%>
	
	<input type="button" value="확인" onClick="winClose(<%=flag%>)">
</body>
</html>