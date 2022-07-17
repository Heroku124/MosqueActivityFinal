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
 * Servlet implementation class UpdateProductController
 */
@WebServlet("/UpdateComplaintController")
public class UpdateComplaintController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ComplaintDAO dao;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateComplaintController() {
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
		RequestDispatcher view = request.getRequestDispatcher("updateComplaint.jsp");
		view.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Complaint complaint = new Complaint();

		complaint.setCID(request.getParameter("CID"));
		complaint.setTumpangzID(request.getParameter("TumpangzID"));
		complaint.setIssueDesc(request.getParameter("IssueDesc"));
		complaint.setIssueTime(request.getParameter("IssueTime"));
		complaint.setIssueDate(request.getParameter("IssueDate"));
		complaint.setPassengerNum(Integer.parseInt(request.getParameter("PassengerNum")));
		complaint.setRidePrice(Double.parseDouble(request.getParameter("RidePrice")));
		complaint.setDriverName(request.getParameter("DriverName"));
	
		
		dao.updateComplaint(complaint);
		
		//forward quest
		request.setAttribute("complaints", ComplaintDAO.getAllComplaint());
		RequestDispatcher view = request.getRequestDispatcher("listComplaint.jsp");
		view.forward(request, response);
	}

}
