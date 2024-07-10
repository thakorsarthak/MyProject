package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.userDAO;
import Model.user;

/**
 * Servlet implementation class UserControllerT
 */
@WebServlet("/UserControllerT")
public class UserControllerT extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserControllerT() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("register"))
		{
			System.out.println("inside controller register");
			user u = new user();
			u.setName(request.getParameter("name"));
			u.setEmail(request.getParameter("email"));
			u.setAddress(request.getParameter("address"));
			u.setContact(Long.parseLong(request.getParameter("contact")));
			u.setPassword(request.getParameter("password"));
			String Email = request.getParameter("email");
			Boolean flag = userDAO.cheackmail(Email);
			System.out.println(u);
			if(flag == false)
			{
				System.out.println("Email is not registered");
				userDAO.userregister(u);
				response.sendRedirect("user-login.jsp");
			}
			else
			{
				System.out.println("Already registered");
				request.setAttribute("msg","Email already registered");
				request.getRequestDispatcher("register-user.jsp").forward(request, response);
			}
		}
		
		else if(action.equalsIgnoreCase("login"))
		{
		 user u1 = new user();
		 u1.setEmail(request.getParameter("email"));
		 u1.setPassword(request.getParameter("password"));
		 String email= request.getParameter("email");
		 Boolean flag = userDAO.cheackmail(email);
		 if(flag == true) {
			 user u2 = userDAO.userlogin(u1);
			 if(u2 == null)
			 {
				 System.out.println("login unsuccess");
				 request.setAttribute("msg","Incorrect password");
					request.getRequestDispatcher("user-login.jsp").forward(request, response); 
			 }
			 else
			 {
				 System.out.println("login success");
				 HttpSession session = request.getSession();
					session.setAttribute("data",u2);
					request.getRequestDispatcher("user-home.jsp").forward(request, response);
			 }
			 
		 }
		 else
		 {
			 System.out.println("email not exist");
			 request.setAttribute("msg1", "pls register first");
				request.getRequestDispatcher("register-user.jsp").forward(request, response);
		 }
		}
		else if(action.equalsIgnoreCase("update"))
		{
			System.out.println("update starts");
			user u = new user();
			u.setId(Integer.parseInt(request.getParameter("id")));
			u.setName(request.getParameter("name"));
			u.setContact(Long.parseLong(request.getParameter("contact")));
			u.setEmail(request.getParameter("email"));
			u.setAddress(request.getParameter("address"));
			
			userDAO.updateuser(u);
			HttpSession session=request.getSession();
			session.setAttribute("data", u);
			request.getRequestDispatcher("user-home.jsp").forward(request, response);
		}
	}

}
