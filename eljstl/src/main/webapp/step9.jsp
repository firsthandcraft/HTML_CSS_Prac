<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="model.MemberVO"%>
<%--jstl 코어태그  --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>step9</title>
<script>
function ageCheck(r){
	var uage= document.ageForm.userAge;
	var flag= isNaN(uage.value);
	if(flag){
		alert("age에 숫자를 입력해주세요");
		uage.value="";
		uage.focus();
		return false;
	} 
	r.submit();
}

</script>
</head>
<body>
<h3>로그인</h3>
<h4>el과 jstl로 다음을 표현</h4>
<p>18세 초과하면 누구님 성인입니다.</p>
<p>13-18세 이면 누구님 청소년입니다.</p>
<p>13세 미만이면 누구님 어린이입니다.</p>

<b>이름 : name="userName"</b>
<b>나이 : age="userAge"</b>

<hr>
<form name="ageForm" method="get" action="step99.jsp">
이름 : <input type="text" name="userName">
나이 : <input type="text" name="userAge">
<input type="button" value="확인" onClick="ageCheck(this.form)">
</form>
</body>
</html>