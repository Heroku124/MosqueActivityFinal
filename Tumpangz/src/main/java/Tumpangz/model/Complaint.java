package Tumpangz.model;

public class Complaint {

	
	private String CID;
	private String TumpangzID;
	private String IssueDesc;
	private String IssueTime;
	private String IssueDate;
	private int PassengerNum;
	private double RidePrice;
	private String DriverName;
	
	
	
	public Complaint() {}
	
	public String getCID() {
		return CID;
	}



	public void setCID(String cID) {
		this.CID = cID;
	}



	public String getTumpangzID() {
		return TumpangzID;
	}



	public void setTumpangzID(String tumpangzID) {
		this.TumpangzID = tumpangzID;
	}



	public String getIssueDesc() {
		return IssueDesc;
	}



	public void setIssueDesc(String issueDesc) {
		this.IssueDesc = issueDesc;
	}



	public String getIssueTime() {
		return IssueTime;
	}



	public void setIssueTime(String issueTime) {
		this.IssueTime = issueTime;
	}



	public String getIssueDate() {
		return IssueDate;
	}



	public void setIssueDate(String issueDate) {
		this.IssueDate = issueDate;
	}



	public int getPassengerNum() {
		return PassengerNum;
	}



	public void setPassengerNum(int passengerNum) {
		this.PassengerNum = passengerNum;
	}



	public double getRidePrice() {
		return RidePrice;
	}



	public void setRidePrice(double ridePrice) {
		this.RidePrice = ridePrice;
	}



	public String getDriverName() {
		return DriverName;
	}



	public void setDriverName(String driverName) {
		this.DriverName = driverName;
	}



}
