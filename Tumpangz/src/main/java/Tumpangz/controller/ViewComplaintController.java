package Tumpangz.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Tumpangz.dao.ComplaintDAO;

/**
 * Servlet implementation class ViewProductController
 */
@WebServlet("/ViewComplaintController")
public class ViewComplaintController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ComplaintDAO dao;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewComplaintController() {
        super();
        dao = new ComplaintDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String CID = request.getParameter("CID");
		
		request.setAttribute("complaint", ComplaintDAO.getComplaint(CID));
		RequestDispatcher view = request.getRequestDispatcher("viewComplaint.jsp");
		view.forward(request, response);
	}
	
}
