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
	<section class="contact_section layout_padding-top">
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-4 col-md-5 offset-md-1">
					<div class="heading_container">
						<h2>Booking Page</h2>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-4 col-md-5 offset-md-1">
					<div class="form_container">
						<form action="shippingControllerT" method="post">
							<div>
								<input type="hidden" name="uid" value="<%=u1.getId()%>" />
							</div>
							<div class="m-12">
							
								<label for="sf">Shipping From</label> <select name="sf"
									id="cars">
									<option value="mumbai">Mumbai</option>
									<option value="ahmedabad">Ahmedabad</option>
									<option value="pune">Pune</option>

								</select>
							</div>
							<br>

							<div class="m-12">
							
								<label for="sf">Shipping From</label> <select name="sf"
									id="cars">
									<option value="mumbai">Mumbai</option>
									<option value="ahmedabad">Ahmedabad</option>
									<option value="pune">Pune</option>

								</select>
							</div>

							<div>
								<input type="date" name="date" />
							</div>

							<div>
								<label for="vehicle">Choose type Vehicle</label> <select
									name="vehicle" id="cars">
									<option value="truck">Truck</option>
									<option value="camper">Camper</option>
									<option value="trailer">Trailer</option>

								</select>
							</div>
							<div class="btn_box">
								<input type="submit" value="Confirm" name="action">


							</div>
						</form>
					</div>
				</div>

			</div>
		</div>
	</section>
</body>
</html>