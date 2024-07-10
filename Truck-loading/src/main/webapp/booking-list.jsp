<%@page import="DAO.shippingDAO"%>
<%@page import="Model.shipping"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="user-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<table class="table">
		<thead>
			<tr class="table-success" style = "text-align: center;">
			<td colspan ="5">BOOKING LIST</td>
			</tr>
			<tr>
				<th scope="col">Shipping From</th>
				<th scope="col">Shipping To</th>
				<th scope="col">Book Date</th>
				<th scope="col">Vehicle</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		<%
	List<shipping> list = shippingDAO.bookingListByid(u1.getId());
	%>
		<%for(shipping s:list) {%>
		<tbody>
			<tr>
				<td scope="row"><%=s.getShipping_from() %></td>
				<td><%=s.getShipping_to() %></td>
				<td><%=s.getDate() %></td>
				<td><%=s.getVehicle() %></td>
				<td><a href="#">Payment</a></td>
			</tr>
		</tbody>
		<%} %>
	</table>
</body>
</html>