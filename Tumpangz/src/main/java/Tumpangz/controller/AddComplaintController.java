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
import Tumpangz.dao.CustomerDAO;

/**
 * Servlet implementation class AddProductController
 */
@WebServlet("/AddComplaintController")
public class AddComplaintController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ComplaintDAO dao;  
	RequestDispatcher view;
	private String forward;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddComplaintController() {
        super();
        dao = new ComplaintDAO();
        // TODO Auto-generated constructor stub
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
