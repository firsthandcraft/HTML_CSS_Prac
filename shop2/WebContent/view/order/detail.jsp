<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>orderDetail</title>
<script type="text/javascript">
function a(price){
	var sel= document.orderForm.quantity.options[orderForm.quantity.selectedIndex].value;
	var q= parseInt(sel);
	var total= q*price;
	orderForm.total_price.value=total;
}
function b(){
	orderForm.o_state.value="1";
	orderForm.submit()
}
</script>
</head>
<body>
<h4>orderDetail</h4>
<form name="orderForm" action="${pageContext.request.contextPath}/order/add" method="post">
<table>
	<tr>
		<th>상품명</th>
		<td>${p.name}</td>
	</tr>
	<tr>
		<th>수량</th>
		<td>
		<select name="quantity" onchange="a(${p.price})" id="quantity">
			<option value="0">수량선택</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
		</select>
		</td>
	</tr>
	<tr>
		<th>결제금액</th>
		<td><input type="text" name="total_price"/></td>
	</tr>
	<tr>
		<th>이미지</th>
		<td><img src="${p.img}" width="300" height="300"/></td>
	</tr>
	<tr>
		<th>설명</th> 
		<td>${p.content}</td>
	</tr>
</table>
	<input type="submit" value="즉시주문">
	<input type="button" value="장바구니 담기" onClick="b()">
	<input type="hidden" name="num" value="${p.num}">
	<input type="hidden" name="o_state" value="0">
	<!--  -->
	<input type="hidden" name="pro_num" value="">
	<input type="hidden" name="o_id" value="">
	<input type="hidden" name="o_date" value="">
	<input type="hidden" name="d_state" value=""> 
</form>
</body>
</html>