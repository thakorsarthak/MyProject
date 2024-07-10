<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file = "mainheader.jsp"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
		String msg1 = (String) request.getAttribute("msg");
		if (msg1 != null) {
			out.print(msg1);
		}
		%>
<section class="contact_section layout_padding-top">
    <div class="container-fluid">
      <div class="row">
        <div class="col-lg-4 col-md-5 offset-md-1">
          <div class="heading_container">
            <h3>
              Pls Login
            </h3>
          </div>
        </div>
      </div>
      <div class="row">
        <div class="col-lg-4 col-md-5 offset-md-1">
          <div class="form_container">
            <form action="UserControllerT" method="post">
              
              <div>
                <input type="email" placeholder="Email" name="email" />
              </div>
              
              <div>
                <input type="password" placeholder="Password" name="password" />
              </div>
              
              <div class="btn_box" >
                <input type="submit" value="Login" name="action" >
                  
                
              </div>
            </form>
          </div>
        </div>
        
      </div>
    </div>
  </section>
</body>
</html>