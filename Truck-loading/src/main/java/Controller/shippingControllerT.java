package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.shippingDAO;
import Model.shipping;

/**
 * Servlet implementation class shippingControllerT
 */
@WebServlet("/shippingControllerT")
public class shippingControllerT extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public shippingControllerT() {
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
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("confirm"));
		{
			shipping s = new shipping();
			s.setUid(Integer.parseInt(request.getParameter("uid")));
			s.setShipping_from(request.getParameter("sf"));
			String sf = request.getParameter("sf");
			s.setShipping_to(request.getParameter("st"));
			String st = request.getParameter("st");
			s.setDate(request.getParameter("date"));
			s.setVehicle(request.getParameter("vehicle"));
			System.out.println(s);
//			if(sf=)
//			shippingDAO.bookshipping(s);
			
			response.sendRedirect("booking-list.jsp");
		}
	}

}
