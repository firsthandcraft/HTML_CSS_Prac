<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>search.jsp</title>
<script>
function del(num){
	location.href="${pageContext.request.contextPath}/DelBoardController?num="+num;
}
</script>
</head>
<body>
<p>search.jsp</p>
<c:set var="str">
	<c:if test="${sessionScope.id!=b.writer}">
		readonly
	</c:if>
</c:set>
<form action="${pageContext.request.contextPath}/EditBoardController" method="post">
	<table border="1">
		<tr>
			<th>�� ��ȣ</th>
			<td><input type="text" value="${b.num }" name="num" size="45"
			readonly></td>
		</tr>
		<tr>
			<th>�ۼ���</th>
			<td><input type="text" value="${b.writer}" name="writer" size="45" readonly></td>
		</tr>
		<tr>
			<th>�ۼ���¥</th>
			<td><input type="text" value="${b.w_date}" name="date" size="45" readonly></td>
		</tr>
		<tr>
			<th>������</th>
			<td><input type="text" value="${b.title}" name="title" size="45" ${str}></td>
		</tr>		
		<tr>
			<th>�۳���</th>
			<td><textarea cols="45" rows="15" name="content"${str}>${b.content}</textarea></td>
		</tr>
		<tr>
			<td colspan="2" style="text-align:center">
				<c:if test="${sessionScope.id==b.writer}">
					<input type="submit" value="����">
					<input type="button" value="����" onClick="del(${b.num})">
				</c:if>
			</td>
		</tr>
	</table>

</form>
</body>
</html>