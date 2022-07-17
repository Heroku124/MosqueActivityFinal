package Tumpangz.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Tumpangz.dao.ComplaintDAO;
import Tumpangz.dao.CustomerDAO;

/**
 * Servlet implementation class ListProductController
 */
@WebServlet("/ListComplaintController")
public class ListComplaintController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ComplaintDAO dao;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListComplaintController() {
        super();
       dao = new ComplaintDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setAttribute("complaints", ComplaintDAO.getAllComplaint());
		RequestDispatcher view = request.getRequestDispatcher("listComplaint.jsp");
		view.forward(request, response);
	}


}
