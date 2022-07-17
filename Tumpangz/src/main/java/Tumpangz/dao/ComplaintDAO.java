package Tumpangz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import Tumpangz.connection.ConnectionManager;
import Tumpangz.model.Complaint;

public class ComplaintDAO {
	static Connection con = null;
	static ResultSet rs = null;
	static PreparedStatement ps = null;
	static Statement stmt = null;
	
	
	private double RidePrice;
	private String CID,TumpangzID,IssueDesc,IssueTime,IssueDate,DriverName;
	private int PassengerNum;
	
	
	public void addComplaint(Complaint bean) {
		
		CID = bean.getCID();
		TumpangzID = bean.getTumpangzID();
		IssueDesc = bean.getIssueDesc();
		IssueTime = bean.getIssueTime();
		IssueDate = bean.getIssueDate();
		RidePrice = bean.getRidePrice();
		PassengerNum = bean.getPassengerNum();
		DriverName = bean.getDriverName();
		
		try {
			
			con = ConnectionManager.getConnection();
			
		
			String sql = "INSERT INTO complaint(CID,TumpangzID,IssueDesc,IssueTime,IssueDate,PassengerNum,RidePrice,DriverName)VALUES(?,?,?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, CID);
			ps.setString(2, TumpangzID);
			ps.setString(3, IssueDesc);
			ps.setString(4, IssueTime);
			ps.setString(5, IssueDate);
			ps.setInt(6, PassengerNum);
			ps.setDouble(7, RidePrice);
			ps.setString(8, DriverName);
			
			
			ps.executeUpdate();
			
			
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	

	public static Complaint getComplaint(String CID) {
		Complaint complaint = new Complaint();
		
		try {
			
			con = ConnectionManager.getConnection();
			
			String sql = "SELECT * FROM complaint WHERE CID=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, CID);
			
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				complaint.setCID(rs.getString("CID"));
				complaint.setTumpangzID(rs.getString("TumpangzID"));
				complaint.setIssueDesc(rs.getString("IssueDesc"));
				complaint.setIssueTime(rs.getString("IssueTime"));
				complaint.setIssueDate(rs.getString("IssueDate"));
				complaint.setPassengerNum(rs.getInt("PassengerNum"));
				complaint.setRidePrice(rs.getDouble("RidePrice"));
				complaint.setDriverName(rs.getString("DriverName"));
			
			
		
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return complaint;
	}
	
	
	public static List<Complaint> getAllComplaint(){
		List<Complaint> complaints = new ArrayList<Complaint>();
		
		try {
			
			con = ConnectionManager.getConnection();
			
			
			String sql = "SELECT * FROM complaint";
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Complaint complaint = new Complaint();
				
				complaint.setCID(rs.getString("CID"));
				complaint.setTumpangzID(rs.getString("TumpangzID"));
				complaint.setIssueDesc(rs.getString("IssueDesc"));
				complaint.setIssueTime(rs.getString("IssueTime"));
				complaint.setIssueDate(rs.getString("IssueDate"));
				complaint.setPassengerNum(rs.getInt("PassengerNum"));
				complaint.setRidePrice(rs.getDouble("RidePrice"));
				complaint.setDriverName(rs.getString("DriverName"));
			
				
				complaints.add(complaint);
			}
			
		
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return complaints;
	}
	
	
	public void updateComplaint(Complaint bean) {
		
		CID = bean.getCID();
		TumpangzID = bean.getTumpangzID();
		IssueDesc = bean.getIssueDesc();
		IssueTime = bean.getIssueTime();
		IssueDate = bean.getIssueDate();
		RidePrice = bean.getRidePrice();
		PassengerNum = bean.getPassengerNum();
		DriverName = bean.getDriverName();
		
		try {
			
			con = ConnectionManager.getConnection();
			
			
			String sql = "UPDATE complaint SET TumpangzID=?, IssueDesc=?, IssueTime=?, IssueDate=?, PassengerNum=?, RidePrice=?, DriverName=? WHERE CID=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, TumpangzID);
			ps.setString(2, IssueDesc);
			ps.setString(3, IssueTime);
			ps.setString(4, IssueDate);
			ps.setInt(5, PassengerNum);
			ps.setDouble(6, RidePrice);
			ps.setString(7, DriverName);
			ps.setString(8, CID);
			
			ps.executeUpdate();
			
			
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void deleteComplaint(String CID) {
		
		try {
			
			con = ConnectionManager.getConnection();
			
	
			String sql = "DELETE FROM complaint WHERE CID=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, CID);
			
		
			ps.executeUpdate();
			
			
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
