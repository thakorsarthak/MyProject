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
					<div class="form_container">
						<form action="UserControllerT" method="post">
						<div>
								<input type="hidden" name="id" value="<%=u1.getId() %>" />
							</div>
							<div>
								<input type="text" placeholder="Your Name" name="name" value="<%=u1.getName() %>" />
							</div>
							<div>
								<input type="number" placeholder="Phone Number" name="contact" value="<%=u1.getContact() %>"  />
							</div>
							<div>
								<input type="email" placeholder="Email" name="email" value="<%=u1.getEmail() %>"  />
							</div>
							<div>
								<input type="text" placeholder="Address" name="address" value="<%=u1.getAddress() %>" />
							</div>
							<div class="btn_box">
								<input type="submit" value="Update" name="action">
							</div>


						</form>
					</div>
				</div>

			</div>
		</div>
	</section>
</body>
</html>