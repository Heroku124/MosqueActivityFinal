package Tumpangz.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Tumpangz.dao.ComplaintDAO;
import Tumpangz.model.Complaint;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ComplaintController")
public class ComplaintController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ComplaintDAO dao;
	RequestDispatcher view;
	private String forward;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComplaintController() {
        super();
        dao = new ComplaintDAO();
       
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("listComplaint")) {
			forward = "listComplaint.jsp";
			request.setAttribute("complaints", ComplaintDAO.getAllComplaint());
		}
		if(action.equalsIgnoreCase("viewComplaint")) {
			forward = "viewComplaint.jsp";
			String CID = request.getParameter("CID");
			request.setAttribute("product", ComplaintDAO.getComplaint(CID));

		}
		if(action.equalsIgnoreCase("deleteComplaint")) {
			String CID = request.getParameter("CID");
			dao.deleteComplaint(CID);
			forward = "listComplaint.jsp";
			
			
			
		}
		if(action.equalsIgnoreCase("updateComplaint")) {
			forward = "updateComplaint.jsp";
			String CID = request.getParameter("CID");
			request.setAttribute("complaint", ComplaintDAO.getComplaint(CID));
		}
		if(action.equalsIgnoreCase("addComplaint")) {
			forward = "addComplaint.jsp";
			request.setAttribute("complaint", ComplaintDAO.getAllComplaint());

		}
		view = request.getRequestDispatcher(forward);
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Complaint complaint = new Complaint();

		complaint.setCID(request.getParameter("CID"));
		complaint.setTumpangzID(request.getParameter("TumpangzID"));
		complaint.setIssueDesc(request.getParameter("IssueDesc"));
		complaint.setIssueTime(request.getParameter("IssueTime"));
		complaint.setIssueDate(request.getParameter("IssueDate"));
		complaint.setPassengerNum(Integer.parseInt(request.getParameter("PassengerNum")));
		complaint.setRidePrice(Double.parseDouble(request.getParameter("RidePrice")));
		complaint.setDriverName(request.getParameter("DriverName"));
	
		dao.addComplaint(complaint);
		
		
		//forward quest
		request.setAttribute("complaints", ComplaintDAO.getAllComplaint());
		view = request.getRequestDispatcher("listComplaint.jsp");
		view.forward(request, response);
	}

}
