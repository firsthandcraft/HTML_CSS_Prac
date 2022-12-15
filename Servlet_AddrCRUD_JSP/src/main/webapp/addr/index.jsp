<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<!-- 
select * from addr;
drop table addr;
drop sequence addr_seq;
create sequence addr_seq;
create table addr(
num number primary key,
name varchar2(10) not null,
tel varchar2(20) not null,
address varchar2(30)not null,
Postal number not null
); -->
<body>
	<a href="<%=request.getContextPath()%>/addr/insert.jsp">주소등록</a>
	<a href="<%=request.getContextPath()%>/control?type=list">전체출력</a>
	<a href="<%=request.getContextPath()%>/addr/find.jsp">검색 삭제</a>
</body>
</html>